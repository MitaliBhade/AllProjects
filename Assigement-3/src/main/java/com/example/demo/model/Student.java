//package com.example.demo.model;
//
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.AttributeOverride;
//import javax.persistence.AttributeOverrides;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Embedded;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToMany;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//import javax.persistence.Transient;
//
//import com.fasterxml.jackson.annotation.JsonInclude;
//import com.fasterxml.jackson.annotation.JsonInclude.Include;
//import com.fasterxml.jackson.databind.PropertyNamingStrategy;
//import com.fasterxml.jackson.databind.annotation.JsonNaming;
//
//@Entity
//@JsonInclude(JsonInclude.Include.NON_EMPTY)
//public class Student /*implements Serializable*/ {
//	
//	 private static final long serialVersionUID = 1L;
//	
//	@Id
//	private int id;
//	private String name;
//	private String tech;
//	
//	
//	//@OneToOne(fetch=FetchType.EAGER)
//	@Embedded
//	@AttributeOverrides({
//		  @AttributeOverride( name = "name", column = @Column(name = "laptop_name")),
//		  @AttributeOverride( name = "weight", column = @Column(name = "laptop_weight"))
//		})
//	private Laptop1 laptop;
////	cascade = {CascadeType.PERSIST, CascadeType.MERGE},
////    fetch = FetchType.LAZY, orphanRemoval = true)
////	//@Transient
////	private List<Laptop> laptop = new ArrayList<Laptop>();;
////	
////	@Column(name = "laptopname")
////	public String getLap() {
////		return this.laptop.lap;
////	}
////	
////	@Column(name = "weightlap")
////	public int getWeight() {
////		return this.laptop.weight;
////	}
//	
//	
////	@OneToMany
////	private List<Laptop> laptop = new ArrayList<Laptop>();
//	
////	@ManyToMany
////	private List<Laptop> laptop = new ArrayList<Laptop>();
////	
//	public Student() {
//		super();
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getTech() {
//		return tech;
//	}
//	public void setTech(String tech) {
//		this.tech = tech;
//	}
//	
////	public List<Laptop> getLaptop() {
////		return laptop;
////   }
////    public void setLaptop(List<Laptop> laptop) {
//// 	this.laptop = laptop;
////    }
//	
//	
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", tech=" + tech + "]";
//	}
//	public Laptop1 getLaptop() {
//		return laptop;
//	}
//	public void setLaptop(Laptop1 laptop) {
//		this.laptop = laptop;
//	}
//	
//	
//	
//
//}
