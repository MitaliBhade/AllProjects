package Codes;

public class countnumberandcharfromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int cnt = 0; int cnt1 = 0;
			String myinput = "Harshal and Mitali,always in love 1234678 !!!!!";
			for(int i = 0; i <myinput.length(); i++ ) {
				
				
				
				if(Character.isDigit(myinput.charAt(i)) ) {					
					
					
					cnt++;
					
					
				}
			
			
				else if (myinput.charAt(i) != ' '){
					
					cnt1++;
				}
			
			 
			
			}
			   System.out.println("No of numbers: " + cnt);
			System.out.println("No of chars: " + cnt1 );
		
	}
}


