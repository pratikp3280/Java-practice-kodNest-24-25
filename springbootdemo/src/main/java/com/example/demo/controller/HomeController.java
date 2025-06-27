package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //Tells Spring this class handles HTTP requests and gives responses (usually JSON or plain text).
public class HomeController {

	 //Maps the root URL (localhost:8080/) to the home() method.
    @GetMapping("/")     
    public String home() {
    	//This text is shown in the browser.
        return "Welcome to Spring Boot!";
    }
}
