package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String name;
	private String surname;
	
	
	public Student(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String string) {
		this.name = string;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String string) {
		this.surname = string;
	}
	
	
}
