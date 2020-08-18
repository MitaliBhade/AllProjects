package accessModifiers;

public class Demo1_1 extends Demo1{

	public static void main(String[] args) {
		
		Demo1_1 demo = new Demo1_1();
		System.out.println(demo.test());
		// TODO Auto-generated method stub

	}

	@Override
	public String test() {
		// TODO Auto-generated method stub
		//System.out.println(super.test());
		return super.test();
	}

}
