package MultiThread;

public class Demo2 implements Runnable {

	

	public static void main(String[] args) {
        Thread guruthread1 = new Thread("Guru1");
        guruthread1.start();
        try {
            guruthread1.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        guruthread1.setPriority(1);
        int gurupriority = guruthread1.getPriority();
        System.out.println(gurupriority);
        System.out.println(guruthread1.getName());
        System.out.println("Thread Running");
  }
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
