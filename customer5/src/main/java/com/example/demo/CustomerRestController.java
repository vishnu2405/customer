package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {
	@Autowired
	private ICustomerService service;
	
	@PostMapping("/book")
	public String saveCustomer(@RequestBody Customer c)
	{
		Integer id=service.saveCustomer(c);
		return "success";
	}

	@GetMapping("/bookings")
	public List<Customer> getAllCustomer()
	{
		List<Customer> allCustomer=service.getAllCustomer();
		return allCustomer;
		}
	
	@DeleteMapping("/cancel/{id}")
	public String CancelCustomer(@PathVariable Integer id)
	{
		service.deleteCustomer(id);
		return "deleted";
	}

}
