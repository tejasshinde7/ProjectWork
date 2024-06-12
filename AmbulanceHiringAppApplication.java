package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entities.Admin;

@SpringBootApplication
public class AmbulanceHiringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmbulanceHiringAppApplication.class, args);
		System.out.println("Welcome to My Ambulance Hiring App");
	}

}
