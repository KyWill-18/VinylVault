import com.google.gson.Gson;

import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;


public class VinylStorage {
    public static void saveVinyl(VinylCollection collection, String fileName){

        try(FileOutputStream fos = new FileOutputStream(fileName);
            OutputStreamWriter isr = new OutputStreamWriter(fos, StandardCharsets.UTF_8)){

            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            gson.toJson(collection.getAllVinyls(), isr);

        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Collection has been saved!");
    }
}