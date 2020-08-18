package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AlienInfo {

	@Id
	private int id;
	private String Colour;
	private String ears;
	public String getColour() {
		return Colour;
	}
	public void setColour(String colour) {
		Colour = colour;
	}
	public String getEars() {
		return ears;
	}
	public void setEars(String ears) {
		this.ears = ears;
	}
	@Override
	public String toString() {
		return "AlienInfo [Colour=" + Colour + ", ears=" + ears + "]";
	}
	
	
}
