package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Authority {
	
	@Id
	private int id;
	
	@Enumerated(EnumType.STRING)
	private AuthorityType name;
	
	public Authority() {
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Authority(AuthorityType names) {
		this.name = names;
	}
	public AuthorityType getName() {
		return name;
	}
	public void setName(AuthorityType names) {
		this.name =names;
	}
	
	

}
