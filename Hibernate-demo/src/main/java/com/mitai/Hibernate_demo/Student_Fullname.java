package com.mitai.Hibernate_demo;

import javax.persistence.Embeddable;


@Embeddable
public class Student_Fullname {
	
	private String fname;
	private String Mname;
	private String lname;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return Mname;
	}
	public void setMname(String mname) {
		Mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Student_Fullname [fname=" + fname + ", Mname=" + Mname + ", lname=" + lname + "]";
	}
	
	

}
