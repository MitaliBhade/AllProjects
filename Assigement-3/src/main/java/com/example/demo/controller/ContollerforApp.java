//package com.example.demo.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.StudentRepo;
//import com.example.demo.model.Student;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonProperty;
//
////import com.example.demo.LaptopRepo;
////import com.example.demo.StudentRepo;
////import com.example.demo.model.Laptop;
////import com.example.demo.model.Student;
////import com.google.gson.Gson;
//
//@RestController
//public class ContollerforApp {
//	
////	@Autowired
////	LaptopRepo repo;
//	
//	@Autowired
//	StudentRepo repo1;
//	
//	
////	@GetMapping("/laptops")
////	public List<Laptop> getlaptoplist() {
////		
////		return repo.findAll();
////		
////	}
//	
//	@PostMapping("/student")
//	public ResponseEntity<Student> addstudent(@RequestBody Student student) {
//		
//		repo1.save(student);
//		return new ResponseEntity<Student>( student, HttpStatus.OK);
//		
//		
//	}
//	
////	@PostMapping("/laptop")
////	public Laptop addlaptop(@RequestBody Laptop laptop) {
////		
////		
////		repo.save(laptop);
////		return laptop;
////	}
//	
//	@GetMapping("/students")
//	public List<Student> getStudent()
//	{
//		
//		return repo1.findAll();
//	}	
//	
//}
