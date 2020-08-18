package package2_codes;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 10; int fact = 1;
		
		for(int i = 1 ; i <= number ; i++ ) {
			
			fact = i * fact;
			
			
		}
		
		System.out.println("Factorial of Number is :" + fact);

	}

}
