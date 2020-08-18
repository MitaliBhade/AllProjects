package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class StudentController {

	
		@Autowired
		StudentRepo repo;
		
		Student std = new Student("Mitali" ,"Bhade");
	
        @RequestMapping("/student")
        public String Studentadd() {
        	
        	repo.save(std);
        	return "Saved to database";
        }

	
	
	                        
}
