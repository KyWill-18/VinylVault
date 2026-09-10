import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


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

    public static void loadVinyl(VinylCollection collection, String fileName){
        Gson gson = new Gson();

        try(Reader reader = new FileReader(fileName)){
            Type vinylListType = new TypeToken<ArrayList<Vinyl>>(){}.getType();

            ArrayList<Vinyl> loadedVinyls = gson.fromJson(reader, vinylListType);

            for (Vinyl vinyl : loadedVinyls){
                collection.addVinyl(vinyl);
            }
        }
        catch (FileNotFoundException e){
            throw new RuntimeException(e);

        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}