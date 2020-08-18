package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.context.annotation.Configuration;


@Entity
public class VisitInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String Person_Name;
	private String Person_to_Visit;
	private String Building;
	private int Flat_no;
	private String Purpose_of_visit;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPerson_Name() {
		return Person_Name;
	}
	public void setPerson_Name(String person_Name) {
		Person_Name = person_Name;
	}
	public String getPerson_to_Visit() {
		return Person_to_Visit;
	}
	public void setPerson_to_Visit(String person_to_Visit) {
		Person_to_Visit = person_to_Visit;
	}
	public String getBuilding() {
		return Building;
	}
	public void setBuilding(String building) {
		Building = building;
	}
	public int getFlat_no() {
		return Flat_no;
	}
	public void setFlat_no(int flat_no) {
		Flat_no = flat_no;
	}
	public String getPurpose_of_visit() {
		return Purpose_of_visit;
	}
	public void setPurpose_of_visit(String purpose_of_visit) {
		Purpose_of_visit = purpose_of_visit;
	}
	@Override
	public String toString() {
		return "VisitInfo [id=" + id + ", Person_Name=" + Person_Name + ", Person_to_Visit=" + Person_to_Visit
				+ ", Building=" + Building + ", Flat_no=" + Flat_no + ", Purpose_of_visit=" + Purpose_of_visit + "]";
	}
		
	

}
