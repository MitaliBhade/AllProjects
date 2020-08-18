package package2_codes;

public class ReverseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String InputString = "BOB";
		String OutputString = "";
		
		String []  InputString1 = InputString.split("");
		
		//System.out.println(InputString1);
		
		for(int i = InputString1.length-1 ; i >= 0 ; i --) {
			
			System.out.print(InputString1[i]);
//			OutputString = OutputString + InputString1[i];
		}
//		System.out.println("\n" + OutputString );
//		if(OutputString.equals(InputString))
//			
//			System.out.println("its pali");
//		
//		else
//			System.out.println("its not pali");

	}

}
