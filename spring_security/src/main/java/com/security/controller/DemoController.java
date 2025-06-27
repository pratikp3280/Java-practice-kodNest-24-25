package com.security.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class DemoController {
		
	@GetMapping("/hello")
	public String hello() {
		return "hello from spring boot";
	}
	
	@GetMapping("/hi")
	public String hi() {
		return "hi from spring boot , Thank You";
	}
	
	@GetMapping("/ola")
	public String ola() {
		return "ola from spring boot, Thank You";
	}
	
}
