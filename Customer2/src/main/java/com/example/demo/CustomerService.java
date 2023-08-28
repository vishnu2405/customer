package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService{
	@Autowired
    private CustomerRepository repo;
	
	@Override
	public Integer saveCustomer(Customer c) {
		c = repo.save(c);
		return c.getBookId();
	}



}
