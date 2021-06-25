import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class OnlineRecipeDatabase {

    String baseUrl = "http://www.recipepuppy.com/api/?";

    public JsonObject getRecipesByIngredients(String ingredients) throws Exception
    {
        //Getting the things ready to connect to the web
        URL url = new URL(baseUrl+"i="+ingredients);
/* TODO 
You have to use the url to retrieve the contents of the website. 
This will be a String, but in JSON format. */
        String contents = "";

        try{
            Scanner urlScanner = new Scanner(url.openStream());
            while (urlScanner.hasNextLine()){
                contents += urlScanner.nextLine();
            }
            urlScanner.close();
        } catch (MalformedURLException e){
            System.out.println("oops " + e.getMessage());
        } catch (IOException e){
            System.out.println("Could not read the webpage " + e.toString());
        }

        JsonObject cont = (JsonObject) Jsoner.deserialize(contents,new JsonObject());

        return cont/* TODO
Remember to return a JSON object.*/;
    }

    public JsonObject getRecipesByDish(String dish) throws Exception
    {
        //Getting the things ready to connect to the web
        /* TODO 
Fill in this data type (Object) */ URL url = new URL /* TODO
Fill in this datatype (Object) */(baseUrl+"q="+dish);

       /* TODO
Read the information coming from the web
 */
        String contents = "";
        try{
            Scanner urlScanner = new Scanner(url.openStream());
            while (urlScanner.hasNextLine()){
                contents += urlScanner.nextLine();
            }
            urlScanner.close();
        } catch (MalformedURLException e){
            System.out.println("oops " + e.getMessage());
        } catch (IOException e){
            System.out.println("Could not read the webpage " + e.toString());
        }
        JsonObject result = (JsonObject)Jsoner.deserialize(contents,new JsonObject());

        return result; /* TODO
return the appropriate result.
*/
    }


    public String formatRecipeAsString(JsonObject doc){
        String results = "";
        /* TODO 
This should return a String with each recipe in three lines:
Title:the title of the recipe
Link:the link to the recipe
Ingredients:The ingredients of teh recipe.*/
        JsonArray rec = (JsonArray) doc.get("results");
        for (int i = 0; i < rec.size(); i++) {
            JsonObject recipe = (JsonObject) rec.get(i);
            String title = (String) recipe.get("title");
            String link = (String) recipe.get("href");
            String ingredients = (String) recipe.get("ingredients");
            results += "Title: " + title + "\nLink: " + link + "\nIngredients: " + ingredients + "\n";
        }
        return results;
    }

    public void saveRecipes(String text, String outfile){
        /* TODO
Given a String with some text in it, write that text to a file. 
The name of the file is given in outfile */
        try{
            BufferedWriter w = new BufferedWriter(new FileWriter(outfile));
            w.write(text);
            w.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
