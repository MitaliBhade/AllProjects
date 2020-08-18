package com.example.demo.controller.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.controller.model.Expenses;

public interface ExpensesRepo extends JpaRepository <Expenses,Integer> {

	 @Query("SELECT SUM(expenses) FROM Expenses")
		Iterable<Expenses> findSum();
	  
	 @Query("SELECT month FROM Expenses WHERE expenses > 650 ")
	 Iterable<Expenses> findexpenses();
	 
	 @Query("SELECT month FROM Expenses WHERE expenses > 5000 ")
	 Iterable<Expenses> findexpenses1();
	
}

/*public interface ExpensesRepo extends CrudRepository <Expenses,Integer>{
	
   @Query("SELECT SUM(expenses) FROM Expenses")
	Iterable<Expenses> findSum();
}*/
