package com.salesSavvy.services;

import com.salesSavvy.entity.Users;

public interface UsersService {
	void signUp(Users user);
	
	Users getUser(String username);
	
	boolean validate(String password, String password2);
}