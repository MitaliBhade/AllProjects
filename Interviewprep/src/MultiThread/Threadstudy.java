package MultiThread;

public class Threadstudy extends Thread {
	
	public void run() {
		
		
		for(int i=1;i<5;i++){  
		    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
		    System.out.println("output of thread one "+i);  
		  }  
		 System.out.println(Thread.currentThread().getName());  
	}

	

}
