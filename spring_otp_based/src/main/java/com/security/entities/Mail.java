package com.security.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String receiver;
	String subject;
	String body;
	private String otp;

	public Mail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mail(int id, String receiver, String subject, String body) {
		super();
		this.id = id;
		this.receiver = receiver;
		this.subject = subject;
		this.body = body;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
//	public String getSubject() {
//		return subject;
//	}
//	public void setSubject(String subject) {
//		this.subject = subject;
//	}
//	public String getBody() {
//		return body;
//	}
//	public void setBody(String body) {
//		this.body = body;
//	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	@Override
	public String toString() {
		return "Mail [id=" + id + ", receiver=" + receiver + ", otp=" + otp + "]";
	}
	
	
	
}
