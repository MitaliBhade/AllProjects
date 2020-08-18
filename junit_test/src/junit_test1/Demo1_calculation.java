package junit_test1;

public class Demo1_calculation {
	
	public static int findMax(int[] array) {
		
		int max = array[0];
		
		for(int i = 1 ; i < array.length ; i++) {
			if(max < array[i])
				max = array[i];
		}
		
		return max;
	}
	
	public static int findSum(int a ,int b) {
		
		int sum = a + b;
		
		return sum;
	}

}
