package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class NavController {
	
	
	@GetMapping("/greet")
	public String greet() {
		System.out.println("Request recieved");
		return "Welcome! To Kodnest";
	}
	
	@GetMapping("/acceptData")
	public String acceptData(@RequestParam String name) {
		System.out.println("Request recieved with Data");
		return "Good Morning.. " + name;
	}
	
	
	
}
