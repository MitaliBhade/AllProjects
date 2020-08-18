package package2_codes;

public class Palidrome_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 1221;int revnum = 0;
		int inputnumber = number;
		
		
		 while(number != 0) {
			
			 int number1 = number % 10 ;
			 revnum = revnum*10 + number1;
			 number = number /10;
			 
		 }
		 
		 System.out.println(revnum);
		 if(revnum == inputnumber)
			 System.out.println("its pali");
		 
		 else
			 System.out.println("its not pali");
	}

}
