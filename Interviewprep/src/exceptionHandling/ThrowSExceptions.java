package exceptionHandling;

public class ThrowSExceptions {
	
	public static void main(String args[]){  
	      validate(8);  
	      System.out.println("rest of the code...");  
	  }  

	static void validate(int age){  
	     if(age<18)  
	      throw new ArithmeticException("not valid age for voting");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	
	
}

