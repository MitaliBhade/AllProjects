//package com.example.demo.controller;
//
//
//import java.util.List;
//import java.util.Optional;
//
//import org.apache.commons.lang3.StringUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.CompareJson;
//import com.example.demo.EmployeeRepo;
//import com.example.demo.JsonRepo;
//import com.example.demo.model.Employee;
//import com.example.demo.model.JsonValues;
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.flipkart.zjsonpatch.JsonDiff;
//
//
//
//@RestController
//public class MyController {
//
//	@Autowired
//	private EmployeeRepo repo;
//	
//	@Autowired
//	private JsonRepo repo1;
//	
//
//	
//	@PostMapping("/employee" )         //PostMapping for post request
//	public /*ResponseEntity<Employee>*/ Employee addEmployee(@RequestBody Employee employee) {
//		
//		repo.save(employee);
//		return employee;
//		//return new ResponseEntity<Employee>(employee, HttpStatus.OK);
//	}
//	
//	@GetMapping("/employees")
//	public List<Employee> getEmployees() {
//		
//		return repo.findAll();
//		}
//	
//	@GetMapping("/employees/{id}")
//	public ResponseEntity<Employee> getEmployeesid(@PathVariable("id") int id) throws Exception {
//		
//		Optional<Employee> employee = repo.findById(id);
//		
//		if(employee == null) {
//	         throw new Exception("Invalid employee id : " + id);
//	    }
//	    return new ResponseEntity<Employee>(HttpStatus.OK);
//		
//		}
//	
//
//	@DeleteMapping("/employee/{id}")
//	public String deleteEmployee(@PathVariable int id) {
//		
//		Employee a = repo.getOne(id);
//		repo.delete(a);
//		return "Deleted";
//	}  
//
//	@PutMapping("/employee")         //PutMapping for put request
//	public Employee SaveorUpdateAlien(@RequestBody Employee employee) {
//		
//		repo.save(employee);
//		return employee;
//	}
//	
///*	@RequestMapping("/compare-json/{id}")
//	public Optional<JsonValues> compareJson(@PathVariable int id)  {
//		
//		String inputJson = " {\r\n \"key\":\"k1\",\"value\":\"v1\"}'\r\n\t} ";
//		 System.out.println(repo1.findById(id).toString());
//		//String dbJson1 = dbJson.toString();
//		//System.out.println(dbJson);
//		CompareJson  json = new CompareJson();
//		
//		//json.compare(repo1.findById(id).toString());
//		 return repo1.findById(id);
//		 ObjectMapper mapper = new ObjectMapper();
//		// ObjectMapper mapper1 = new ObjectMapper();
//		JsonNode json1= mapper.readTree(inputJson);
//		 JsonNode json2= mapper.readTree(repo1.findById(id).toString());
//		 JsonNode patchNode = JsonDiff.asJson(json1, json2);
//		 String diffs = patchNode.toString();
//		
//	}*/
//
//	}	
//	
//
//
//
//
//
