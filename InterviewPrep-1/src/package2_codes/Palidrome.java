package package2_codes;

public class Palidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String myinput = "BOBT";
	    String rev = "";
		for (int i = myinput.length()-1 ; i >= 0 ; i --) {
			
			
			
			rev = rev + myinput.charAt(i);
			
			
		}
		
		//System.out.println(rev);
		if(rev.equals(myinput)) {
			
			System.out.println("its palidrome");
		}
		else
		{
			
			System.out.println("not a palidrome");
		}
		
	}
}
