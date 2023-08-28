package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {
	@Autowired
	private ICustomerService service;
	
	@PostMapping("/addCustomer")
	public String saveCustomer(@RequestBody Customer c)
	{
		Integer id=service.saveCustomer(c);
		return "success";
	}


}
