package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dao.InfoRepo;


@Controller
public class MyController {
	
	@Autowired
	InfoRepo repo;
	
	@RequestMapping("/")
	public String getHomePage() {
		
		return "home.jsp";
	}

	@RequestMapping("/getlist")
	@ResponseBody
	public List getvisitlist() {
	
		return repo.findAll();
	}
}
