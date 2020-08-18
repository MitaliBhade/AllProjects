package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;


@Controller  //if controller is used need @Responsebody else mention @RestController
public class AlienController {

	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		
		return "home.jsp";
	}
	@RequestMapping("/addAlien")
	public String addAline(Alien alien) {
		
		repo.save(alien);
		return "home.jsp";
	}
	
	/*//POST request for Alien
	@PostMapping("/alien")         //PostMapping for post request
	public Alien addAlien(@RequestBody Alien alien) {
		
		repo.save(alien);
		return alien;
	}
	
	//DELTE alien
	@DeleteMapping("/alien/{id}")
	public String deleteAlien(@PathVariable int id) {
		
		Alien a = repo.getOne(id);
		repo.delete(a);
		return "deleted";
	}
	
	//PUT request for Alien
	@PutMapping("/alien")         //PutMapping for put request
	public Alien SaveorUpdateAlien(@RequestBody Alien alien) {
		
		repo.save(alien);
		return alien;
	}
	
	
	@RequestMapping("/getAlien") // with jsp
	public ModelAndView getAline(@RequestParam int id) {
		
		ModelAndView mv = new ModelAndView("showAlien.jsp");
		Alien alien = repo.findById(id).orElse(null);
		System.out.println(repo.findByTech("Java"));
		System.out.println(repo.findByIdGreaterThan(101));
		System.out.println(repo.findByTechSorted("Java"));
		mv.addObject(alien);
		return mv;
	}
	//~~~~~ for string output
/*	@RequestMapping("/aliens") // Rest 
	@ResponseBody
	public String getAliens() {
		
	return repo.findAll().toString();
	}
	
	@RequestMapping("/alien/{id}") // Rest  {for wildcard entry}
	@ResponseBody
	public String getAlien(@PathVariable("id") int id) {
		
		System.out.println(repo.findById(id).toString());
	return repo.findById(id).toString();
	}
	
	//~~~~~~~~~ for json body output,JPA repository in AlienRepo and jackson is there in Maven 
	//GET reuqest for alines
	@RequestMapping("/aliens") // Rest //0r @GetMapping for get request
	//~~to get xml plase dependency in pom
//	@RequestMapping(path = "/aliens",produces = {"application/json"}) //to produce only json
	@ResponseBody
	public List<Alien> getAliens() {
		
	return repo.findAll();
	}
	//GET reuqest for aline with id
	@RequestMapping("/alien/{id}") // Rest  {for wildcard entry}
	@ResponseBody
	public Optional<Alien> getAlien(@PathVariable("id") int id) {
		
	System.out.println(repo.findById(id).toString());
	return repo.findById(id);
	
	}*/
	
	
}

