import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import java.io.*;

public class Task {
    public static void main(String[] args){
        Task t = new Task();
        JsonObject doc = t.readJson("./resources/restaurant-data.json");
        Database db = new Database(doc);
        System.out.println(db.getRestaurant("Hometown BBQ"));
        System.out.println(db.getAvgReviews("Casa Enrique"));
    }

    public JsonObject readJson(String filename){/* TODO: create a JSON object with the contents of  "filename". You can use the method below to help you read the file. */
       /* Put in the variable that should be returned. */ //em.exit(-1);
        JsonObject doc = (JsonObject) Jsoner.deserialize(readFile(filename), new JsonObject());
        return doc;
    }

    public String readFile(String filename){
            String content = "";
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
                String s = reader.readLine();
                while(s != null) {
                    content += s;
                    s = reader.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(-1);
            }

        return content;
    }
}