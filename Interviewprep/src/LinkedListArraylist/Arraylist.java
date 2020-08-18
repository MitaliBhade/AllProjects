package LinkedListArraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList(); //non-generic
		ArrayList<String> myString = new ArrayList();
		
		list.add(6);
		list.add(0, 't');
		myString.add("Mitali");
		myString.add("Harshal");
		System.out.println("non generic arraylist is :" + list);
		System.out.println("generic arraylist is :" + myString);
		
		Iterator itr=list.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  ArrayList<String> myString1 = new ArrayList();
		  Iterator itr1=myString.iterator();  
		  while(itr1.hasNext()){  
		 System.out.println(itr1.next());  
			  
		  }  
		  
		 /* for(String obj:myString)  {  with for loop
			    System.out.println(obj);  
			 }  */
		  
		//iteration through other ways  
		  /*ListIterator<String> list1=list.listIterator(list.size());  
          while(list1.hasPrevious())  
          {  
              String str=list1.previous();  
              System.out.println(str);  
          }  
    System.out.println("Traversing list through for loop:");  
       for(int i=0;i<list.size();i++)  
       {  
        System.out.println(list.get(i));     
       }  
          
    System.out.println("Traversing list through forEach() method:");  
    //The forEach() method is a new feature, introduced in Java 8.  
        list.forEach(a->{ //Here, we are using lambda expression  
            System.out.println(a);  
          });  
            
        System.out.println("Traversing list through forEachRemaining() method:");  
          Iterator<String> itr=list.iterator();  
          itr.forEachRemaining(a-> //Here, we are using lambda expression  
          {  
        System.out.println(a);  
          });  */
		 
	}
	
}
