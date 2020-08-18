package Codes;

import java.util.ArrayList;
import java.util.List;

public class Sumofnumberwithevencountinarray {
	
	public static void main(String[] args) {
	
		
	int array [] = {1,3,4,5,3,1,1,4,5,5};
	int count = 0;
	
	for(int i = 0 ; i < array.length ; i ++) {
		
		for(int j = array.length-1 ; j > 0 ; j --) {
		
		if(array[i] == array[j]) {
			
			count++;
		}
		
		
		}
	}
	
	System.out.println(count);
		
	}

}
