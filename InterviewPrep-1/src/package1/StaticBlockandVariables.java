package package1;

public class StaticBlockandVariables {

	//can be declare without initization
	static int val1;
	static String val2;
	
	//final int cal2 = 100;
	
	static{
	      System.out.println("Static Block 1");
	      val1 = 68;
	      val2 = "Block1";
	      
	  } 
	  //Second static block
	  static{
	      System.out.println("Static Block 2");
	      val1 = 98;
	      val2 = "Block2";
	  }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int cal2 = 100;
		System.out.println("Value of val1 :" + val1);
		System.out.println("Value of val2 :" + val2);
	
		//StaticBlockandVariables v1 = new StaticBlockandVariables();
		
		
		int cal1 = cal2;
		System.out.println(cal1);

	}

}
