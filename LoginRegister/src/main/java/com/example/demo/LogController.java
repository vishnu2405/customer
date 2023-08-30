package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@PostMapping("/reg")
	public String registerUser(@RequestBody UserModel userModel )
	{
		User user=userService.registerUser(userModel);
		return "Success";
	}
	
	@GetMapping("/home")
	public String home()
	{
		return "This is Home Page";
	}
	
	@GetMapping("/admin")
	public String admin()
	{
		return "This is Admin Page";
	}
}