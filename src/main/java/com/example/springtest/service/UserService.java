package com.example.springtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springtest.entity.User;
import com.example.springtest.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	//Custom filteration - write implementation code in repository
	public User getUserByEmail(String email) {
		return userRepo.findByEmail(email);
	}
	
	public User saveUser(User user) {
		return userRepo.save(user);
	}
	
	
}

/*
 
 Service - It will take care of the business logic
 Controller - Will do the Mapping
 Repository - Storage
 */