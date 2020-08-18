package MultiThread;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GuruThread3 threadguru1 = new GuruThread3("guru1");
		  threadguru1.start();
		  GuruThread3 threadguru2 = new GuruThread3("guru2");
		  threadguru2.start();
	}

}
