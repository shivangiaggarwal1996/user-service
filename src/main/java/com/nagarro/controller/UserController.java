package com.nagarro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.entity.user;
import com.nagarro.model.UserModel;
import com.nagarro.repository.UserRepositoryInterface;
import com.nagarro.serviceimpl.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private UserRepositoryInterface userRepository;
	
	@GetMapping(value = "/{email_id}")
	public UserModel getUser(@PathVariable(name = "email_id") String email_id) {
		return userService.getUser(email_id);
	}
	
}
