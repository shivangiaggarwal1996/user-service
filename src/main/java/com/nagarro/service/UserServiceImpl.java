package com.nagarro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.entity.user;
import com.nagarro.model.UserModel;
import com.nagarro.repository.UserRepositoryInterface;
import com.nagarro.serviceimpl.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepositoryInterface userRepository;

	public UserModel getUser(String email_id) {
		user user = userRepository.findById(email_id).get();
		return new UserModel(user.getName(), user.getEmail());
		

	}

	
	

}
