/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.vhes.common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import vn.vhes.ui.MainForm;

/**
 *
 * @author danglph
 */
public class JsonUtils {
    
    
    private static Logger logger = Logger.getLogger(JsonUtils.class);
    private static JsonParser jsonParser = new JsonParser();
    
    public static String object2Json(Object data) {

        Gson gson = new GsonBuilder()
                .create();
        return gson.toJson(data);
    }

    public static <T> T jSon2Object(JsonElement jsonElement, Class<T> enClass) {

        Gson gson = new GsonBuilder()
                .create();
        return gson.fromJson(jsonElement, enClass);
    }
    
    public static JsonElement parseStr(String response){
         return jsonParser.parse(response);
    }

    public static void writeJSONFile(String vi_path, JSONObject viObject) throws IOException {
        
        try (FileWriter file = new FileWriter(vi_path)) {

            file.write(viObject.toJSONString());
            file.flush();

        } catch (IOException e) {
            throw e;
        }
    }
    
    
    public static void writeToFile(String pathToFile, JSONObject jsonObject, Charset ENCODING) throws IOException {
        Path path = Paths.get(pathToFile);

        try {
            BufferedWriter writer = Files.newBufferedWriter(path, ENCODING);
            writer.write(jsonObject.toJSONString());
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            logger.error(ex.getMessage(), ex);
            throw ex;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw e;
        }
    }
    
}
