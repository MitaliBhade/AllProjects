package streamAPI;

import java.util.ArrayList;
import java.util.List;

public class Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> values = new ArrayList<>();
		
		for(int i = 1 ; i <= 10 ; i ++) {
      
			values.add(i);
			
		}
		
		values.stream().map(i -> i * i).forEach(System.out::println);
		System.out.println("!!!!!!!!!!!!!!!!!");
		System.out.println(values.stream().map(i -> i*i).reduce(0,(c,e) -> c+e));
		System.out.println("*****************");
		System.out.println(values.stream().map(i -> i*i).reduce(0,(c,e) -> Integer.sum(c, e)));
		System.out.println("&&&&&&&&&&&&&&&&&");
		System.out.println(values.stream().map(i -> i*i).reduce(0,Integer :: sum));
	}

}
