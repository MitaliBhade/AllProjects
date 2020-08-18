package streamAPI;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Test1 {
	public static void main(String[] args) throws Exception {
		
		LinkedList<Integer> list1 = new LinkedList();
		list1.add(1);
		list1.add(5);
		list1.add(6);
	Stack<Integer> list = new Stack<>(); 
	list.push(1);
	list.push(5);
	list.push(6);
	System.out.println(list);
	System.out.println(list1.poll().equals(list.pop()));
	System.out.println(Class.forName("String").getName());
	
	List<Integer> list11 = new LinkedList<Integer>();
	list11.add(1);
	list11.add(2);
	list11.add(3);
	list11.add(4);
        Collections.rotate(list11, 2);
        System.out.println(list11);
	
	}

}
