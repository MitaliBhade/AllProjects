package streamAPI;

import java.util.Arrays;
import java.util.List;

public class Part3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(4,7,55,6,75,10,120);
		System.out.println(list.stream()
				               .filter(i -> i%5 == 0) 
				               .reduce(0 , Integer :: sum));
		
		System.out.println("!!!!!!!!!!!!!!!!!!");
		
		System.out.println(list.stream()
	               .filter(i -> i%5 == 0) 
	               .findFirst() 
	               .orElse(0));
	}

}
