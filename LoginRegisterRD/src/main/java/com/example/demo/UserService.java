package com.example.demo;

import java.util.List;

public interface UserService 
{
	String registerUser(User user);

	List<User> showAll();
}
