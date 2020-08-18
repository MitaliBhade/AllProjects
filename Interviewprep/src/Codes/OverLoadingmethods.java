package Codes;

public class OverLoadingmethods {

	public static void main(String[] args) {
	
	
	}
	
	public static void show(String myname) {
		
		System.out.println("output1:" + myname);
	}
	
  public static void show(StringBuilder myname) { 
		
		System.out.println("output2:" + myname);
	}
  public static void show(StringBuffer myname) {
		
		System.out.println("output3:" + myname);
	}

}
