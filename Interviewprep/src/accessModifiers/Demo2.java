package accessModifiers;

public class Demo2 {
	
		   public void myMethod()
		   {
			System.out.println("Overridden method parent class");
		   }	   
		
		static class Demo extends Demo2{
		   public void myMethod(){
			//This will call the myMethod() of parent class
			super.myMethod();
			System.out.println("Overriding method child class");
		   }
		   public static void main( String args[]) {
			Demo obj = new Demo();
			obj.myMethod();
		   }
		}

}
