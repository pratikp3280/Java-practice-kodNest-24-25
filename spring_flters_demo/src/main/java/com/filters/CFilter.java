package com.filters;

import java.io.IOException;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

@Order(1)
@Component
public class CFilter implements Filter{
	
		public void doFilter(ServletRequest request, 
				ServletResponse response , FilterChain chain) throws IOException , ServletException{
		
			System.out.println(" Passig Filter C");	
			chain.doFilter(request, response);
										
		
		}
	
}