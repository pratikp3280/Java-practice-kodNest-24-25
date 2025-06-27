package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.model.Model;

import java.lang.annotation.Target;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class NavController {
	
	@GetMapping("/greet")
	public String greet(Model m) {
		m.addAttribute("greeting" , "Good Mornng");
		return "greet" ;
				
	}

	
	
}
