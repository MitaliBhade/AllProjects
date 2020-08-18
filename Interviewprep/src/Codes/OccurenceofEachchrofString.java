package Codes;
//pending
public class OccurenceofEachchrofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mystring = "MitaliMilind";
	
		int counter[] = new int[256]; 

		int len = mystring.length(); 
		System.out.println(len);
		for (int i = 0; i < len; i++) 
			counter[mystring.charAt(i)]++;
		char array[] = new char[mystring.length()];
		
		for(int i = 0 ; i < len ; i ++) {
		
		array[i] = mystring.charAt(i);
		int flag = 0;
		  for (int j = 0 ; j <= i ; j++) { 

				/* If a char is found in String then set the flag 
				 * so that we can print the occurrence
				 */
				if (mystring.charAt(i) == array[j])  
					flag++;                 
			   } 
		  
		  if (flag == 1)  
		      System.out.println("Occurrence of char " + mystring.charAt(i)+" " +counter[mystring.charAt(i)]);
			             
		} 
		
	}
	}
	
	


