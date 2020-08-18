package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.EmailService;
import com.example.demo.controller.dao.ExpensesRepo;
import com.example.demo.controller.model.Expenses;


@Controller
public class ExpenseManagerController {

	
	@Autowired
	ExpensesRepo repo;

	@Autowired
	private EmailService email;
	
	@RequestMapping("/")
	public String ExpensesHomePage() {
		
		//return  "/allExpenses";
		return "home";
		
	}
	
	@RequestMapping("/addExpenses")  
	//public ResponseEntity<Expenses> addExpenses(Expenses expenses)
	public String addExpenses(Expenses expenses)
	{
		repo.save(expenses);
		return "addexpenses";
		//return new ResponseEntity<Expenses>(expenses, HttpStatus.OK);
	}
	
	/*@RequestMapping(path = "/allExpenses" ) //String output
	@ResponseBody
	public String getExpenses() {
		
	//System.out.println("Sum of all Expenses" + repo.findSum());
	return repo.findAll().toString() + "  Sum of all Expenses" + repo.findSum() ;

			
	}*/
	
	@RequestMapping("/allExpenses" )
//	@RequestMapping(path = "/allExpenses" ,produces = {"application/json"})  //json output
	public String getExpenses(Model theModel) {  
		
		List<Expenses> exp = repo.findAll();
		Iterable<Expenses> totalExpenses = repo.findSum();
		Iterable<Expenses> expensesgetter = repo.findexpenses();
		theModel.addAttribute("expenses" ,exp);
		theModel.addAttribute("totalExpense" ,totalExpenses);
		theModel.addAttribute("getterthan" ,expensesgetter);
		System.out.println(totalExpenses);
		System.out.println(expensesgetter);
	//	System.out.println(theModel);
		
		return "expenses-list";
	//System.out.println("Sum of all Expenses" + repo.findSum());
	//return repo.findAll(); /*+ "  Sum of all Expenses" + repo.findSum();*/

	}		
	
	@RequestMapping("/queryExpenses" )
//	@RequestMapping(path = "/allExpenses" ,produces = {"application/json"})  //json output
	//@ModelAttribute("queryList")
	public String getExpenses1(Model theModel) {  
		
	
		Iterable<Expenses> expensesgetter650 = repo.findexpenses();
		Iterable<Expenses> expensesgetter5000 = repo.findexpenses1();
		theModel.addAttribute("getterthan650" ,expensesgetter650);
		theModel.addAttribute("getterthan5000" ,expensesgetter5000);
		System.out.println(expensesgetter650);
		System.out.println(expensesgetter5000);
		
		return "query-list";
		
	}
	
	@RequestMapping("/delete")
	public String Delete(@RequestParam("id") int id) {
		
		repo.deleteById(id);
		return "redirect:/allExpenses";
	}
	
		@GetMapping(value = "/sendmail")
   public String sendmail() {

	   email.sendMail("account1@expensemanager.com", "Your Expenditur So far", repo.findAll().toString()
			  /* +" Sum of all Expenses" + repo.findSum()*/);

	   return "emailsent";
	    }
   
	
}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//~~~~~not to be used in this code...~~~~~~~
	/*@RequestMapping("/allExpenses") // with jsp need to give in url all this values,get data from client
	public ModelAndView getAline(Expenses ex) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj" , ex);
		mv.setViewName("showexpenses.jsp");
		return mv;
	}*/
	
	

