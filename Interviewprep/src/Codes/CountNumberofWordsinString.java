package Codes;

public class CountNumberofWordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int cnt = 0;
		String myinput = "Harshal and Mitali,always in love!!!!!";
		
		   for(int i = 0; i <myinput.length(); i++) {    
	            if(myinput.charAt(i) != ' ')    
	                cnt++;    
	        }   
		   
		   System.out.println("no of characters: " + cnt);
		
	}

}
