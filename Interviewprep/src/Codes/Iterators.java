package Codes;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList al = new ArrayList();
		 al.add("harshal");
		// al.add(null);
		 
		 Iterator itr = al.iterator();
		 
		 while(itr.hasNext()) {
			 
			 Object a = itr.next();
			 System.out.println(a);
		 }
	}

}
