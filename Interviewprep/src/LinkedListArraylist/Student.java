package LinkedListArraylist;

public class Student {
	
 String name;
 int rollno;
	 char division;
	public Student( int rollno,String name, char division) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.division = division;
	}
	public String getName() {
		return name;
	}
	public int getRollno() {
		return rollno;
	}
	public char getDivision() {
		return division;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void setDivision(char division) {
		this.division = division;
	}
	
	

}
