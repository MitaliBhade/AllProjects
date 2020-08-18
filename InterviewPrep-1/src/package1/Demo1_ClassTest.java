package package1;

public class Demo1_ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassA s1 =  new ClassB();
		
		System.out.println(s1.myName());
		
		System.out.println(s1.mySurname());

        ClassB s2 =  new ClassB();
		
		System.out.println(s2.myName());
		
		System.out.println(s2.mySurname());
		
		 ClassA s3 =  new ClassA();
		 
		System.out.println(s3.myName());
			
		System.out.println(s3.mySurname());
	}

}
