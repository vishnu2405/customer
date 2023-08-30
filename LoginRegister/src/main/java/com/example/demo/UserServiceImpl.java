package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	UserRepository repo;
	
	@Override
	public User registerUser(UserModel userModel) 
	{
		User user=new User();
		user.setFirstName(userModel.getFirstName());
		user.setLastName(userModel.getLastName());
		user.setEmail(userModel.getEmail());
		user.setPassword(userModel.getPassword());
		user.setRole("USER");
		repo.save(user);
		return user;
	}

}