package com.nagarro.repository;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.nagarro.model.User;

@Repository
public class UserRepository {
	
	HashMap<String, User> userMap = new HashMap<String, User>() {{
		put("john@gmail.com", new User("john","23","john@gmail.com"));
		put("joe@gmail.com", new User("joe","29","joe@gmail.com"));
	}}; 



	public User getUser(String email_id) {
		User user = null;
		if(userMap.containsKey(email_id)) {
			user = userMap.get(email_id) ;
		}
		
		return user;
	}


}
