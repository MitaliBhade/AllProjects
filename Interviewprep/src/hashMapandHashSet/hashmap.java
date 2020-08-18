package hashMapandHashSet;

import java.util.HashMap;
import java.util.HashSet;

public class hashmap {
	
	 public static void main(String[] args) {
	     // Create a HashMap
	     HashMap<Integer, String> hmap = new HashMap<Integer, String>();
	 
	     //add elements to HashMap
	     hmap.put(1, "AA");
	     hmap.put(2, "BB");
	     hmap.put(3, "CC");
	     hmap.put(4, "DD");
	 
	     // Displaying HashMap elements
	     System.out.println("HashMap contains: "+hmap);
	  
	 
	 HashSet<String> hset = new HashSet<String>();
	 
     //add elements to HashSet
     hset.add("AA");
     hset.add("BB");
     hset.add("CC");
     hset.add("DD");
 
     // Displaying HashSet elements
     System.out.println("HashSet contains: ");
     System.out.println(hset);
     for(String temp : hset){
        System.out.println(temp);
     }

}
}