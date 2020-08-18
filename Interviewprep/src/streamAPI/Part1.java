package streamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> values = Arrays.asList(1 ,2 ,3,4 ,5 ,6);
		values.forEach(System.out::println);  //call by method/method reference.
//		out- is object  //system is class out is object of system class.
//		println - is the method from it.
		System.out.println("^^^^^^^^^^^");
		
		values.forEach(i -> doubleit(i));
		
		System.out.println("$$$$$$$$$$$");
		
		values.forEach(Part1 :: doubleit);
		
		System.out.println("@@@@@@@@@@");
		
	//	for(int i : values);
		
		//values1.forEach(i -> System.out.println(i));
		//Consumer is interface
//		Consumer <Integer> c = new Consumer<Integer>()
//				{
//
//					@Override
//					public void accept(Integer t) {
//						// TODO Auto-generated method stub
//						System.out.println(t);
//						
//					}
//			
//			     
//				};
				
				Consumer <Integer> c1 = (Integer i) -> System.out.println(i);
				
				values.forEach(c1);
				//or 
                  System.out.println("~~~~~~~~~~~~~~~~~~");
               Consumer <Integer> c2 =  i -> System.out.println(i);
				
				values.forEach(c2);
				
				
				//orr
				System.out.println("???????????????????");
				values.forEach((i) -> System.out.println(i*i));
				
				//or
				System.out.println("*********");
				values.forEach(new Consumer<Integer>() {

					@Override
					public void accept(Integer t) {
						
						System.out.println(t);
						
					}
					
					
				});
	}
	
	public static void doubleit(int i) {
		
		System.out.println(i*i);
	}
	
	

}
