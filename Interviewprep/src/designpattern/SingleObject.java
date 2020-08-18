package designpattern;

public class SingleObject {
	
	// private static SingleObject instance = new SingleObject(); //eager
	private static SingleObject instance;                       //lazy

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private SingleObject(){}

	 //EAGER initilization
	   //Get the only object available
//	   public static SingleObject getInstance(){  
//	      return instance;
//	   }
	   
	   //
	    public static synchronized SingleObject getInstance(){  //synchronized use for thread safe ,multithreading and double check 
	        if(instance == null){                             //LAZY initilization(Checking of instance)
	            instance = new SingleObject();
	        }
	        return instance;
	    }


	   public void showMessage(){
	      System.out.println("Hello World!");
	   }

}
