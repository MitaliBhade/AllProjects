package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Alien {
	
    @Id
    @GeneratedValue
 	private int id;
	private String name;
	private String Tech;
	@ManyToOne
	private AlienInfo alieninfo;
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
	public String getTech() {
		return Tech;
	}
	public void setTech(String tech) {
		Tech = tech;
	}
	public AlienInfo getAlieninfo() {
		return alieninfo;
	}
	public void setAlieninfo(AlienInfo alieninfo) {
		this.alieninfo = alieninfo;
	}

	
	
	
	
}
