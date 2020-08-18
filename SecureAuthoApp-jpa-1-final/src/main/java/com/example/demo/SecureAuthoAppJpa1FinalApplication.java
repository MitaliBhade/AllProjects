package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.model.UserRepo;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepo.class)
public class SecureAuthoAppJpa1FinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureAuthoAppJpa1FinalApplication.class, args);
	}

}
