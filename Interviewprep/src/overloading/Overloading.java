package overloading;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(myname("Mitali Harshal bhore"));
		System.out.println(myname(28));
	}
	
	public static String myname(String name) {
		
		return name;
	}
	
	public static int myname(int age) {
		return age;
		
		
	}

}
