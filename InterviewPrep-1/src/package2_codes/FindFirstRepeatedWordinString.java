package package2_codes;

public class FindFirstRepeatedWordinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myString = "Bob isn't Tob but Bob is not lot and Lot in tob";
		String myOutputString = "";
		int cnt ;
		String myString1 = myString.toLowerCase();
		
		System.out.println(myString1);

		String[] myString2 = myString.split(" ");
		
		for(int i = 0 ; i < myString2.length ; i ++) {
			 cnt = 1;
		
		  for(int j = i + 1 ; j < myString2.length  ; j ++) {
			 
			  if( myString2[i].equalsIgnoreCase(myString2[j]) && i != j) {
				  
				 myOutputString = myString2[i];
		
			  }
			 
		  }
		  
		 
		}
	}
}

		
	

