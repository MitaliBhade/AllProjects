package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Alieninfo {
	
	@Id
	private String Colour;
	private int ears;
	@OneToOne
	private AlienAdress alienaddress;
	public String getColour() {
		return Colour;
	}

	public void setColour(String colour) {
		Colour = colour;
	}

	public int getEars() {
		return ears;
	}

	public void setEars(int ears) {
		this.ears = ears;
	}

	public AlienAdress getAlienaddress() {
		return alienaddress;
	}

	public void setAlienaddress(AlienAdress alienaddress) {
		this.alienaddress = alienaddress;
	}
	
}
