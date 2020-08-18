package LinkedListArraylist;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedListReverseandunderstand {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {


		
		@SuppressWarnings("rawtypes")
		LinkedList list = new LinkedList();
		 list.add(1);
		 list.add("K");
			
		 System.out.println("input Link list is 1:" + list);
	list.addFirst(5);
	list.add("k");
	list.add(4, '6');
	list.addLast("M");

	
	System.out.println("input Link list is 2:" + list);
	
	 Iterator i=list.descendingIterator();  
     while(i.hasNext())  
     {  
         System.out.println(i.next());  
     }  
     
     Iterator itr = list.iterator(); 
     while(itr.hasNext()) {
    	 
    	 System.out.println("input final String is:" + itr.next());
     }
     
     LinkedList list1 = new LinkedList();
     list1.add("Q");
     list1.add("p");
     list.addAll(list1);
     
 	System.out.println("input Link list is 3:" + list1);
     LinkedList list2 = new LinkedList();
     list2.add("9");
     list2.add("w");
     list.addAll(3, list2);

  	System.out.println("input Link list is 4:" + list2);
     
     Iterator itr1 = list.iterator(); 
     while(itr1.hasNext()) {
    	 
    	 System.out.println("input final String is of 2nd itr:" + itr1.next());
     }
	
	}
	

	}
	
	

