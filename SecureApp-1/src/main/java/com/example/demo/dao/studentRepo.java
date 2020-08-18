package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.student.student;

public interface studentRepo extends JpaRepository <student, Integer>{
	
	List<student> findByFirstNameAndCompany(String Name);
}
