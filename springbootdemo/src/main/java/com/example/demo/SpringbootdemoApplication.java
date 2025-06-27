/*Main Java file
 * This is your starting point. 
 * It contains @SpringBootApplication and main() method that runs your Spring Boot app. */
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}

}



// Run As → Java Application
// after console prints sprint : Open in Browser
// type URL: http://localhost:8080/
// You should see: Welcome to Spring Boot!
// Congratulations! Your first Spring Boot project is running successfully!