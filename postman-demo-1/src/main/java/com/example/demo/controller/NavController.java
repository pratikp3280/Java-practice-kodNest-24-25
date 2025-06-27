package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Student;

@RestController
public class NavController {
	
	@GetMapping("/greet")
	public String greet() {
		return "Have a Good Day!";
		
	}
	
	@GetMapping("/manageData")
	public String manageData(@RequestParam String data) {
		return "Data recieved : " + data;
	}
	
	@PostMapping("/manageObject")
	public Student manageObject(@RequestBody Student st) {
		return st;
	}
	
	
	
}
