package package2_codes;

import java.util.Arrays;

public class FindDuplicateinArrayandSaveinArray {
	
	
	public static void main(String[] args) {
		
		
		int[] a = {1,0,4,5,6,1};
		int[] b = {5,6,3,4,0,10,9,1};
		//common are 1,0,4,5,6
		int[] c = new int[a.length];
		for(int i = 0 ; i < a.length ; i ++) {
			
			for(int j = 0 ; j < b.length ; j ++) {
				
				
				if(a[i] == b[j]  )
				{
					c[i] = a[i];
		            		
				}
				
				
			}
		}

		
        System.out.println("\n\nContents of c[] "); 
        for (int i=0; i< c.length; i++) 
            System.out.print(c[i] + " ");
		
	
	}

}
