package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Alien {
	
	private int id;
	private String Anmae;
	private String tech;
	@Autowired
	@Qualifier("lap1")
	private Laptop laptop;
	
	
	public Alien() {
		super();
		System.out.println("object created");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnmae() {
		return Anmae;
	}
	public void setAnmae(String anmae) {
		Anmae = anmae;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}

	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public void show() {
		
		System.out.println("its showing");
		laptop.compiling();
	}

}
