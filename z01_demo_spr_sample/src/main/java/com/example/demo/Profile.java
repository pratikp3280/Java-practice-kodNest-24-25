package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {
	@Value("$(p.name)")
	String name;
	@Value("$(p.age)")
	int age;
	@Value("$(p.adresses)")
	String adresses;
	
	
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profile(String name, int age, String adresses) {
		super();
		this.name = name;
		this.age = age;
		this.adresses = adresses;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



	public String getAdresses() {
		return adresses;
	}

	public void setAdresses(String adresses) {
		this.adresses = adresses;
	}


	@Override
	public String toString() {
		return "Profile [name=" + name + ", age=" + age + ", adresses=" + adresses + "]";
	}



	
	
	
}
