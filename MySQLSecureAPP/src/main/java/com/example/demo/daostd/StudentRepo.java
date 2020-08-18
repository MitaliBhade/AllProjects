package com.example.demo.daostd;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.classes.Student;

public interface StudentRepo extends JpaRepository<Student ,Integer> {

}
