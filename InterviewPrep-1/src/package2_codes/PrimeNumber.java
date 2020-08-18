package package2_codes;

public class PrimeNumber {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		int n = 5 ; boolean flag = true;
		for (int i = 2 ; i < n ; i ++) {
			
			if (n % i == 0) {
				
				flag = false;
				break;
			}
	
			
		}

	
	
	if(flag) {
		
		System.out.println("its a prime number");
	}
	else
		System.out.println("its not a prime number");

	
}
}
