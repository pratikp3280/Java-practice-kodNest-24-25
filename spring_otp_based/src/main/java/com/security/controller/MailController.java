package com.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.security.entities.Mail;
import com.security.services.MailService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MailController {

    @Autowired
    MailService service;

//    @PostMapping("/send")
//    public String send(@ModelAttribute Mail mail) {
//        System.out.println(mail);
//        service.sendmail(mail);
//        return "sent";
//    }
    
    @PostMapping("/send")
    public String sendMail(HttpServletRequest request , HttpSession session) {
        String to = request.getParameter("receiver"); 
        
        // Generate 5-digit OTP
        String otp = String.valueOf((int)(Math.random() * 90000) + 10000);
        
     // Store OTP in session
        session.setAttribute("otp", otp);

        // Send mail
        String subject = "Your OTP Code";
        String body = "Your OTP is: " + otp;

        service.sendMail(to, subject, body);

        return "redirect:/verify"; // Redirect to OTP input page
    }
    
    @GetMapping("/verify")
    public String showVerifyPage() {
        return "verify"; // this resolves to verify.html
    }

    @PostMapping("/verify-otp")
    public String verifyOtp(HttpServletRequest request, HttpSession session, Model model) {
        String enteredOtp = request.getParameter("otp");
        String sessionOtp = (String) session.getAttribute("otp");

        if (sessionOtp != null && sessionOtp.equals(enteredOtp)) {
            model.addAttribute("message", "OTP Verified Successfully!");
            return "success"; // Create success.html for confirmation
        } else {
            model.addAttribute("message", "Invalid OTP. Please try again.");
            return "verify"; // Show verify page again with error
        }
    }

    
    
    
}

