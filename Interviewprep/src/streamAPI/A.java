package streamAPI;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class A extends B{
	
	public void foo() {
	}

	@Override
	protected final void greeting() {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("d");
		Collections.rotate(list, 2);
		System.out.println(list);
		
	}

}
