package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.studentRepo;
import com.example.demo.student.student;



@RestController
public class HomeController {

	@Autowired
	studentRepo repo;
	

	//POST request for Alien
		@PostMapping("/student")         //PostMapping for post request
		public student Student(@RequestBody student student) {
			
			
			repo.save(student);
			return student;
		}
		
		//DELTE alien
		@DeleteMapping("/student/{id}")
		public String deleteAlien(@PathVariable int id) {
			
			student a = repo.getOne(id);
			repo.delete(a);
			return "deleted";
		}
		
		//PUT request for Alien
		@PutMapping("/student")         //PutMapping for put request
		public student SaveorUpdateAlien(@RequestBody student student) {
			
			repo.save(student);
			return student;
		}
		
		//@PreAuthorize("hasRole('USER')")
		@RequestMapping("/students") // Rest //0r @GetMapping for get request
		//~~to get xml plase dependency in pom
//		@RequestMapping(path = "/aliens",produces = {"application/json"}) //to produce only json
		@ResponseBody
		public List<student> getAliens() {
			
		return repo.findAll();
		}
		//GET reuqest for aline with id
		@RequestMapping("/student/{id}") // Rest  {for wildcard entry}
		@ResponseBody
		public Optional<student> getAlien(@PathVariable("id") int id) {
			
		System.out.println(repo.findById(id).toString());
		return repo.findById(id);
		
		}

	
	
	
}
