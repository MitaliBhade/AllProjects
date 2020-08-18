package Unmodified;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class unmodified {
	
	public static void main(String[] args) {  
        List<String> list = new ArrayList<>();  
      Collections.addAll(list, "Google", "Mozila FireFox", "Yahoo");  
      list = Collections.unmodifiableList(list);  
      System.out.println("Unmodifiable List: " + list);  
      //list.add("Safari");         
      System.out.println(camelToSnake("HackerEarth"));
      
	}  
	
	
	public static String camelToSnake(String camelStr) {
	
	String ret = camelStr.replaceAll("([A-Z]+)([A-Z][a-z])", "$1_$2").replaceAll("([a-z])([A-Z])", "$1_$2");
	return ret.toLowerCase();

	}
}
