package MultiThread;

import jdk.tools.jaotc.AOTDynamicTypeStore.Location;

public class Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// join() wait till other thread is being added.
		
		
		Threadstudy t1 = new Threadstudy();
		Threadstudy1 t2 = new Threadstudy1();
		t2.setPriority(10);
		t1.start();
		t2.start();
		System.out.println(t1);
		System.out.println(t2);
	
//		t1.start();
//		try {
//			t1.join(50000);
//		}catch(Exception e) {
//			
//			System.out.println(e);
//		}
//		
//		t2.start();
	}

}
