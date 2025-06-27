package com.authentication.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authentication.entities.Users;
import com.authentication.repository.UsersRepository;

@Service
public class UsersServiceImplementation 
				implements UsersService{
		
	@Autowired
	UsersRepository repo;
	
	//This will save the User Info(Sign-Up Data) in the Database
	public void signUp(Users user) {
		repo.save(user);   
	}

	
	public boolean usernameExist(String username) {
		Users user = repo.findByUsername(username);
		if(user != null) {
			return true;
		} else {
			return false;
		}
	}


	public Users getUser(String username) {
		// TODO Auto-generated method stub
		return repo.findByUsername(username);
	}
}
