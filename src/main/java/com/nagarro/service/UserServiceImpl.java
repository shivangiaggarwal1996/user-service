package com.nagarro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.model.User;
import com.nagarro.repository.UserRepository;
import com.nagarro.serviceimpl.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;

	public User getUser(String email_id) {
		// TODO Auto-generated method stub
		return userRepository.getUser(email_id);
	}
	
	

}
