package com.filters.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class DemoController {
			
	@GetMapping("/hello")
	public String hello() {
		System.out.println("Controller Executing ");
		return "HELLO";
	}
	

}
