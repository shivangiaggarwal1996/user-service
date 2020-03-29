package com.nagarro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.model.User;
import com.nagarro.serviceimpl.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/{email_id}")
	public User getUser(@PathVariable(name = "email_id") String email_id) {
		
		return userService.getUser(email_id);
	}

}
