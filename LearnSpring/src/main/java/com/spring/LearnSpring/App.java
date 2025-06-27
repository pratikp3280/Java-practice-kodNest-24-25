package com.spring.LearnSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        
//        Laptop l = ctx.getBean("lappy" , Laptop.class);
//        System.out.println(l);
        
        Person p = ctx.getBean("person" , Person.class);
        System.out.println(p);
    }
}
