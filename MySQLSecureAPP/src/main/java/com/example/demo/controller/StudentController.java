package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.classes.Student;
import com.example.demo.daostd.StudentRepo;


@RestController
public class StudentController {
	
	@Autowired
	StudentRepo repo;
	

	//POST request for Alien
		@PostMapping("/student")         //PostMapping for post request
		public Student addAlien(@RequestBody Student student) {
			
			
			repo.save(student);
			return student;
		}
		
		//DELTE alien
		@DeleteMapping("/student/{id}")
		public String deleteAlien(@PathVariable int id) {
			
			Student a = repo.getOne(id);
			repo.delete(a);
			return "deleted";
		}
		
		//PUT request for Alien
		@PutMapping("/student")         //PutMapping for put request
		public Student SaveorUpdateAlien(@RequestBody Student student) {
			
			repo.save(student);
			return student;
		}
		
		@RequestMapping("/students") // Rest //0r @GetMapping for get request
		//~~to get xml plase dependency in pom
//		@RequestMapping(path = "/aliens",produces = {"application/json"}) //to produce only json
		@ResponseBody
		public List<Student> getAliens() {
			
		return repo.findAll();
		}
		//GET reuqest for aline with id
		@RequestMapping("/student/{id}") // Rest  {for wildcard entry}
		@ResponseBody
		public Optional<Student> getAlien(@PathVariable("id") int id) {
			
		System.out.println(repo.findById(id).toString());
		return repo.findById(id);
		
		}

}
