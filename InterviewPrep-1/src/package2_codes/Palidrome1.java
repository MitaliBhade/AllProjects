package package2_codes;

public class Palidrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myinputString = "BOB";
		boolean flag = false;
		String rev = "";
		String[] token = myinputString.split("");
		for(int i = token.length-1 ; i >= 0 ; i --) {
			
			System.out.print(token[i]);
			 rev = rev + token[i];
		}
		
		if(rev.equals(myinputString))
			
			System.out.println("\t its pali");
		else
			System.out.println("its not Pali");
	}

}
