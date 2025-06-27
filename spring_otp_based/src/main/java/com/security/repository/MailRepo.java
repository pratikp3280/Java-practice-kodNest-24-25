package com.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.security.entities.Mail;

public interface MailRepo 
               extends JpaRepository<Mail , Integer> {
	
	
}
