package designpattern;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//SingleObject object = new SingleObject(); //not allowed as constructor is private and object is singleton
		
		SingleObject object = SingleObject.getInstance();
 
		object.showMessage();
		String myname = "ABC".concat("str").concat("str");
		System.out.println(myname);
		
	}

}
