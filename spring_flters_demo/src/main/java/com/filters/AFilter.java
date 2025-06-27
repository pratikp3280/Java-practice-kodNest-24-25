package com.filters;

import java.io.IOException;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

@Order(3)
@Component
public class AFilter implements Filter{
	
		public void doFilter(ServletRequest request, 
				ServletResponse response , FilterChain chain) throws IOException , ServletException{
		
			System.out.println(" Passig Filter A");	
			chain.doFilter(request, response);
				
		}
	
}