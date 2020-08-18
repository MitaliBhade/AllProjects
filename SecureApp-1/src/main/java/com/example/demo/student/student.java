package com.example.demo.student;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class student {

	@Id
	private int id;
	private String name;
	private String Company;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	
	
}
