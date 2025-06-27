package com.spring.LearnSpring_Profile;

import java.util.List;
import java.util.Map;

public class Profile {
	
	String name;
	String dob;
	List<String> adresses;
	Map<Integer, String> documents;
	
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profile(String name, String dob, List<String> adresses, Map<Integer, String> documents) {
		super();
		this.name = name;
		this.dob = dob;
		this.adresses = adresses;
		this.documents = documents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public List<String> getAdresses() {
		return adresses;
	}

	public void setAdresses(List<String> adresses) {
		this.adresses = adresses;
	}

	public Map<Integer, String> getDocuments() {
		return documents;
	}

	public void setDocuments(Map<Integer, String> documents) {
		this.documents = documents;
	}

	@Override
	public String toString() {
		return "Profile [name=" + name + ", dob=" + dob + ", adresses=" + adresses + ", documents=" + documents + "]";
	}
	
	
	
}
