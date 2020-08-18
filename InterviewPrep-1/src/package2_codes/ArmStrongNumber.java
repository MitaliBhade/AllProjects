package package2_codes;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 153566; int sum = 0; int inputnumber = number;
		
		while (number != 0) {
			
			int rev = number % 10;
			
			rev = rev * rev * rev ;
			
			sum = sum + rev ;
			
			number = number/10;
		}

	if(inputnumber == sum)
		
		System.out.println("its an armstrong nunber");
	
	else
		
		System.out.println("not an armstrong number");
	}

}
