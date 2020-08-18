package CompareJson.CompareJson;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

import org.apache.commons.lang3.StringUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.ISO8601Utils;
import com.google.common.collect.MapDifference;
import com.google.common.collect.MapDifference.ValueDifference;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

/**
 * Hello world!
 *
 */
public class App 
{
	
	/* private static FileWriter file;
    public static void main( String[] args ) throws JsonMappingException, JsonProcessingException {
        System.out.println( "Hello World!" );
       
      /* ObjectMapper mapper = new ObjectMapper();
        
          String jason1 =  " { \r\n \"id \": \"1212\" ,\r\n \"fullName\": \"John Miles\" \r\n\t} ";
       String jason2 =  " { \r\n \"id \": \"1212\" ,\r\n \"fullName\": \"John Miles\" \r\n\t} ";
		
			assertEquals(mapper.readTree(jason1), mapper.readTree(jason2));
		
       
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("C:\\Users\\mitali.bhade\\eclipse-workspace\\arenaapi-master\\CompareJson\\Input.txt"));
            Object obj1 = parser.parse(new FileReader("C:\\Users\\mitali.bhade\\eclipse-workspace\\arenaapi-master\\CompareJson\\Output.txt"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONObject jsonObject1 = (JSONObject) obj1;
            System.out.println(jsonObject.toJSONString());
            System.out.println(jsonObject1.toJSONString());
            Gson g = new Gson();
            Type mapType = new TypeToken<Map<String, Object>>(){}.getType();
            Map<String, Object> firstMap = g.fromJson(jsonObject.toJSONString(), mapType);
           Map<String, Object> secondMap = g.fromJson(jsonObject1.toJSONString(), mapType);
            System.out.println(Maps.difference(firstMap ,secondMap ));
            MapDifference<String, Object> difference = Maps.difference( secondMap ,firstMap);
       
            File file=new File("C:\\Users\\mitali.bhade\\eclipse-workspace\\arenaapi-master\\CompareJson\\difference.txt");
            file.createNewFile();  
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(difference.toString());
            fileWriter.flush();  
            fileWriter.close();
           
             Set<String> s = jsonObject.keySet();
           for (String str : s) {
                System.out.println("key:" + str + " : value1:" + jsonObject.get(str) + ":value2:" + jsonObject1.get(str));
                //compare value of json1 with json2
                Map<String, Object> firstMap1 = new HashMap<String, Object>();
                Map<String, Object> firstMap2 = new HashMap<String, Object>();
                firstMap1.put("value1", jsonObject.get(str));
                firstMap2.put("value2", jsonObject1.get(str));
                MapDifference<String, Object> difference1 = Maps.difference( firstMap2 ,firstMap1);
                System.out.println(difference1);
               
                System.out.println("\n\nEntries differing\n--------------------------");
                difference.entriesDiffering()
                          .forEach(new BiConsumer<String, ValueDifference<Object>>() {
							@Override
							public void accept(String key, ValueDifference<Object> value) {
								System.out.println(key + ": " + value);
							}
						});
            }

        } catch (Exception e) {
           e.printStackTrace();
        	
        }
        
        MapDifference<String, Object> difference = Maps.difference(firstMap, secondMap);
        System.out.println("\n\nEntries differing\n--------------------------");
        System.out.println(difference);
        
       
}
}


 * //String bdJson1 = dbJson JsonObject jsonObject = (JsonObject) inputJson;
 * JsonObject jsonObject1 = (JsonObject) dbJson;
 * 
 * Gson g = new Gson(); Type mapType = new TypeToken<Map<String,
 * Object>>(){}.getType(); Map<String, Object> firstMap =
 * g.fromJson(jsonObject.toString(), mapType); Map<String, Object> secondMap =
 * g.fromJson(jsonObject , mapType); System.out.println(Maps.difference(firstMap
 * ,secondMap )); MapDifference<String, Object> difference = Maps.difference(
 * secondMap ,firstMap); System.out.println(difference); return "COMPARED";
 



*/
	 public static void main( String[] args ) {
		 
		 
		/* String myname = "mitali";
		 
	
		 char[] mystringarray = myname.toCharArray();
		 
		 System.out.println(mystringarray);
		 System.out.println(new String(mystringarray));*/
		 String myString = "XYZ";
		 String myString1 = new String("XYZ2");
		
	 }}