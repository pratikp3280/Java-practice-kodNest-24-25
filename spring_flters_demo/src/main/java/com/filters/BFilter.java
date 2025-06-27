package com.filters;

import java.io.IOException;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;

@Order(2)
@Component
public class BFilter implements Filter{
	
		public void doFilter(ServletRequest request, 
				ServletResponse response , FilterChain chain) throws IOException , ServletException{
		
			System.out.println(" Passig Filter B");	
			chain.doFilter(request, response);
			
		}
	
}
