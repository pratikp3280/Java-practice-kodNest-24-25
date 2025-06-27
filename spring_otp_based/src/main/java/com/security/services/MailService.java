package com.security.services;

public interface MailService {
	
//	void sendmail(Mail mail);
//	void sendOtp(Mail mail);
	void sendMail(String to, String subject, String body);

	
}
