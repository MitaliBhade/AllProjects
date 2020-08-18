package com.example.demo;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class Exceptionhandling extends RuntimeException  {
	
	public  void DogsNotFoundException(String message) {
        System.out.println(message);
    }

}
