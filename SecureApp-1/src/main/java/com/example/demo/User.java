package com.example.demo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class User {

	@Id
	private long id;
	private String username;
	private String password;
	/*@OneToOne(cascade = CascadeType.ALL ,fetch = FetchType.EAGER)
	@JoinTable(name="user_authority",
	joinColumns={@JoinColumn(name="user_id", referencedColumnName="id")},
    inverseJoinColumns={@JoinColumn(name="authority_id", referencedColumnName="id")})*/
	private String Authority;

	
	public User() {
		
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAuthorities() {
		return Authority;
	}
	public void setAuthorities(String authority) {
		this.Authority = authority;
	}

	
	
	
	
	
	
}
