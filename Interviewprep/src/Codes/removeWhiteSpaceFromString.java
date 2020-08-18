package Codes;

public class removeWhiteSpaceFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myName = "  Mitali .";
		
		//String myname = myName.trim();
		System.out.println("input:" + myName);
		//System.out.println("After removing white spaces:" + myname);
		String withoutspace = myName.replaceAll("\\s", "");
		System.out.println("Output:" + withoutspace);

	}

}
