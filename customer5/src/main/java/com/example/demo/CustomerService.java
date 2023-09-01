package com.example.demo;

import java.util.List;

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

	@Override
	public List<Customer> getAllCustomer() {
		List x=(List) repo.findAll();
		return x;
	}

	@Override
	public String deleteCustomer(int bookId) {
		
		repo.deleteById(bookId);
		return "Deleted";
	}
	

}
