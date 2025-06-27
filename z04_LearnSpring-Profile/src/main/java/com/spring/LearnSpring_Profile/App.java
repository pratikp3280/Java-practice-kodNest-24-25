package com.spring.LearnSpring_Profile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
       
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        
		User u = ctx.getBean("user", User.class);
		System.out.println(u);
        
        
    }
}
