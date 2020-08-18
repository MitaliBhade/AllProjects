package com.mitai.Hibernate_demo;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;




@Entity(name = "new_table")
//@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Student1 {
	
	@Id//primary key
	private int id;
	//@Transient
	private String Fullname;
	//private Student_Fullname Fullname;
	//private String lastname;
	@Column(name = "Colour")
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
  /*  public Student_Fullname getFullname() {
		return Fullname;
	}
	public void setFullname(Student_Fullname fullname) {
		this.Fullname = fullname;
	}*/
	public String getFullname() {
		return Fullname;
	}
	public void setFullname(String fullname) {
		this.Fullname = fullname; }
	
	/*public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}*/
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", Fullname=" + Fullname + ", email=" + email + "]";
	}
	
	

}
