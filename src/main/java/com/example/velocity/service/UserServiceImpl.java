package com.example.velocity.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.velocity.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public List<User> getUserData() {

		 List<User> users = new ArrayList<>();
		 User user = new User(1,"John","Doe", "25","M");
		 users.add(user);
		 user = new User(1,"John","Doe", "5","M"); 
	        return users;
	}

}
