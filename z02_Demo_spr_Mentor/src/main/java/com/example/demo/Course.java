package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Course {
	@Value("${name}")
	String name;
	@Value("${duration}")
	int duration;
	
	@Autowired
	Mentor m;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	// @Autowired
	public Course(String name, int duration, Mentor m) {
		super();
		this.name = name;
		this.duration = duration;
		
		this.m = m;
		System.out.println("param-constructor");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Mentor getM() {
		return m;
	}
	
	
	public void setM(Mentor m) {
		this.m = m;
		
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", duration=" + duration + ", m=" + m + "]";
	}
	
	
	
	
}
