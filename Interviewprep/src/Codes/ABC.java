package Codes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ABC {
	
	public static void main(String[] args) {
	
		ArrayList<ArrayList<Integer>> array =
	            new ArrayList<ArrayList<Integer>>();
	        for(int i=0; i<10000; i++) {
	            try {
	                array.add(new ArrayList<Integer>(1000000));
	            } catch (OutOfMemoryError e) {
	                System.out.println(i);
	                break;
	            }
	        }
	    }
	
	}


