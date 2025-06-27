package com.filters;

import java.io.IOException;

import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;

@Component
public class MyFilter implements Filter{
	
		public void doFilter(ServletRequest request, 
				ServletResponse response , FilterChain chain) throws IOException , ServletException{
			
			//HttpServletRequest httpReq = (HttpServletRequest)request;
//			System.out.println("Request is passing the filter");
//			System.out.println("URL Requested: " + httpReq.getRequestURI());
			
			System.out.println(" Before calling doFilter");	
			chain.doFilter(request, response);
			System.out.println("After Calling doFilter");							
			
			
		}
	
}
