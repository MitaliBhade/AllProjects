package MultiThread;

public class GuruThread3 implements Runnable {

	
	Thread guruthread;
	 private String guruname;
	 GuruThread3(String name) {
	  guruname = name;
	 }
	 @Override
	 public void run() {
	  System.out.println("Thread running: " + guruname);
	  for (int i = 0; i < 4; i++) {
	   System.out.println(i);
	   System.out.println(guruname);
	   try {
	    Thread.sleep(10000);
	   } catch (InterruptedException e) {
	    System.out.println("Thread has been interrupted");
	   }
	  }
	 }
	 public void start() {
	  System.out.println("Thread started");
	  if (guruthread == null) {
	   guruthread = new Thread(this, guruname);
	   guruthread.start();
	  }
	 
	 }
	

}