package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	/*public String home(HttpServletRequest req)
	{
		HttpSession Session = req.getSession();
		String name = req.getParameter("name");
	    System.out.println("hi " + name);
		Session.setAttribute("name",name);
		return "home";
	}*/
	
/*	public String home(@RequestParam("name")String Myname,HttpSession session) {
	
		System.out.println("hi " + Myname);
		session.setAttribute("name",Myname);
		return "home";
		
	}*/

	/*public ModelAndView home(@RequestParam("name")String name) {
		
		ModelAndView mv = new ModelAndView();
		name = name.toUpperCase();
		mv.addObject("name", name);
		mv.setViewName("home");
		return mv;
		
	}*/
	
	//pass entire object not the paramerters one by one

	public ModelAndView home(Alien aline) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj" ,aline);
		mv.setViewName("home");
		return mv;
		
	}
}
