package LinkedListArraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylitsForStudentclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student std1 = new Student(101 ,"Mitali" , 'A');
		Student std2 = new Student(102 ,"Harshal" , 'A');
		Student std3 = new Student(103 ,"Ankita" , 'B');
		
		ArrayList list = new ArrayList();
		list.add(std1);
		list.add(std2);
		list.add(std3);
		
		Iterator itr =list.iterator();
		while(itr.hasNext()) {
			
			Student st = (Student)itr.next();
			System.out.println("Student data is :"+ st.rollno + " " + st.name + " and division is " + st.division);
		}
	}

}
