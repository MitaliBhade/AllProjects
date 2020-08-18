package Codes;

public class StringTest {
	
	public static void main(String[] args) {
	
		
		String a = "ABC" ;
		//String b = "ABC";
		
		String b = new String("ABC");
		
		System.out.println("1: " + a.equals(b)); //values are equale
		System.out.println("2");
		System.out.println( a == b);//address are not equal
		
		System.out.println("3: " + a.equalsIgnoreCase(b));
		
		System.out.println("hascode:");
		System.out.println (  a.hashCode( )== b.hashCode());
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		a.concat("hello");
		System.out.println(a);
		
		a = a.concat("hello");
		System.out.println(a);
		
		
		String s=new String("");  
		String s2=s.intern();  
		System.out.println(s2);//Sachin  
	}

}
