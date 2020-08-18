package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AlienAdress {

	@Id
	private String building;
	private String area;
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	
}
