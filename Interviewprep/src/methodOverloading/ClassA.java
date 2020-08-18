package methodOverloading;

public class ClassA {
	
/*	public void add(int a ,int b) {
		
		int sum =  a +  b;
	}
	
	public void add(int a ,int b ,int c) { //valid
		
		int sum = a + b + c;
	}
	
	public void add(int a ,double b) {
		
		double sum = a + b;
	}
	
	public void add(double b ,int a) {
		
		double sum = a + b;
	}*/
	
	
	public int add(int a ,int b) {
		
		int sum = a + b;
		
		return sum;
		
}
	public float add(int a ,float b) {
		
		float sum = a + b;
		return sum;
	}//this is not a
	

}
