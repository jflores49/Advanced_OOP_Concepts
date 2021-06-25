import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Database {
    public JsonObject obj;
    /* TODO 
Declare a member variable that can 
be EASILY set from the constructor. */


    public Database(JsonObject data){
        /* TODO
set the memebr variable declared above.*/
        this.obj = data;
    }

    public JsonObject getRestaurant(String name){
        /* TODO 
Complete this method as specified. */
        JsonObject rtsObj = new JsonObject();
        JsonArray rts = (JsonArray) obj.get("restaurants");
        for (int i = 0; i < rts.size(); i++) {
            JsonObject n = (JsonObject) rts.get(i);
            String rName = (String) n.get("name");
            if (rName.equals(name))
                rtsObj = n;
        }
        return rtsObj;
    }

    public double getAvgReviews(String name){
        /* TODO 
Complete this method as specified.
 The previous method may be of help. 
*/
        JsonObject restObj = getRestaurant(name);
        JsonArray rev = (JsonArray) restObj.get("reviews");

        BigDecimal sum = new BigDecimal(0);
        double c = 0;
        for (int i = 0; i < rev.size(); i++) {
            JsonObject ratings = (JsonObject) rev.get(i);
            sum = sum.add((BigDecimal) ratings.get("rating"));
            c++;
        }
        BigDecimal cc = new BigDecimal(c);
        sum = sum.divide(cc, 1, RoundingMode.HALF_UP);
        return sum.doubleValue();
    }
}
