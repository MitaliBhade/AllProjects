//package com.example.demo.model;
//
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.annotation.Resource;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//
//import com.fasterxml.jackson.databind.PropertyNamingStrategy;
//import com.fasterxml.jackson.databind.annotation.JsonNaming;
//
//
//@Entity
////@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
//
//public class Laptop implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//	
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int id;
//	public String lap;
//    public int weight;
//	
////	@ManyToMany
////	private List<Student> student = new ArrayList<Student>();
//	
////	@OneToMany
////	private Student student ;
//	
//	
//	
//	public Laptop() {
//		super();
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getLap() {
//		return lap;
//	}
//	public void setLap(String lap) {
//		this.lap = lap;
//	}
//	
////	public List<Student> getStudent() {
////		return student;
////	}
////	public void setStudent(List<Student> student) {
////		this.student = student;
////	}
//	
//	
//	
////	public Student getStudent() {
////		return student;
////	}
////	public void setStudent(Student student) {
////		this.student = student;
////	}
//	
//	
//	
//	@Override
//	public String toString() {
//		return "Laptop [id=" + id + ", lap=" + lap + "]";
//	}
//	public int getWeight() {
//		return weight;
//	}
//	public void setWeight(int weight) {
//		this.weight = weight;
//	}
//	
//
//	
//}
