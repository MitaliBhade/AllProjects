package package1;

public class Emp {
	
	
	int id ;
	String name;
	
	

	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Emp e1 = new Emp(101,"Mitali");
		Emp e2 = new Emp(101,"Mitali");
		
		System.out.println(e1 == e2);
		System.out.println(e1.equals(e2));
		//Both are false bcz hashcodes are different
	}

}
