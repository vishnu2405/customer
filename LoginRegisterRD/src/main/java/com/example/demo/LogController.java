package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
@RequestMapping("/user")
public class LogController 
{
	@Autowired
	private UserService userService;
	
	@GetMapping("/home")
	public String home()
	{
		return "Welcome to our Website Home Page";
	}
	
	@PostMapping("/reg")
	public String registerUser(@RequestBody User user)
	{
		String users=userService.registerUser(user);
		return users;
	}
	
	
	@PreAuthorize("hasAuthority('ROLE_USER')")
	@GetMapping("/all")
	public List<User> showAll()
	{
		List<User> allUser=userService.showAll();
		return allUser;
	}
	
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	@GetMapping("/admin")
	public String admin()
	{
		return "Welcome to our Website Admin Page";
	}

}