package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoSprApplication {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext("AppConfig.class");
        
		User u = ctx.getBean( "user" , User.class);
		System.out.println(u);
	}

}
