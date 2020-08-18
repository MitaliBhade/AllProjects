package package2_codes;

public class AvoidDeadLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		https://javarevisited.blogspot.com/2018/08/how-to-avoid-deadlock-in-java-threads.html
		
//		Create two methods which call lock on same sequence as integer class and on String class
//		if sequcne in different it might cause lock.
		
//		public class DeadLockFixed { /** * Both method are now requesting lock in same order, * first Integer and then String. * You could have also done reverse e.g. first String and then Integer, * both will solve the problem, as long as both method are requesting lock * in consistent order. */ public void method1() { synchronized (Integer.class) { System.out.println("Aquired lock on Integer.class object"); synchronized (String.class) { System.out.println("Aquired lock on String.class object"); } } } public void method2() { synchronized (Integer.class) { System.out.println("Aquired lock on Integer.class object"); synchronized (String.class) { System.out.println("Aquired lock on String.class object"); } } } }

	}

}
