package MultiThread;

public class Threadstudy1 extends Thread{
public void run() {
		
		
		for(int i=1;i<5;i++){  
		    try{Thread.sleep(700);}catch(InterruptedException e){System.out.println(e);}  
		    System.out.println("output of thread two " + (i+i));  
		  }  
		 System.out.println(Thread.currentThread().getName());  
	}

}
