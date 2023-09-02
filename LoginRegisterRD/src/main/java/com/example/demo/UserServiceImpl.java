package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	UserRepository repo;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Override
	public String registerUser(User user) 
	{
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		repo.save(user);
		return "User is Registered";
	}

	@Override
	public List<User> showAll() 
	{
		List<User> x=repo.findAll();
		return x;
	}

}