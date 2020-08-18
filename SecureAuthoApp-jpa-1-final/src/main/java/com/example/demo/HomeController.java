package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.User;
import com.example.demo.model.UserRepo;

@Controller
public class HomeController {
	
	@Autowired
	private UserRepo repo;
	
	
	@GetMapping("/login")
	public String login()  {
		
		return "login.jsp";
		
		
	}
	@GetMapping("/")
	public String home() {
		
		return "welcome.jsp";
	}
	
	@RequestMapping("/signup")  
	public String addExpenses(User user)
	{
		repo.save(user);
		return "welcome.jsp";
	}
	
	@GetMapping("/user")
	public String user() {
		
		return ("<h1> Welcome User </h1>");
	}
	
	@GetMapping("/admin")
	@ResponseBody
	public String admin() {
		
		return ("<h1> Welcome Admin </h1>");
	}

}
