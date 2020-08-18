package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//thymleaf can use to get html pages and can have font and colour for our page by .css file in static folder which has 
//Reference from template .html file
@Controller
public class DemoController {

	
	@RequestMapping("/hello")
	public String hello() {
		
		return "helloworld";
	}
}
