package com.example.demo;

import java.util.List;

public interface ICustomerService {
	public Integer saveCustomer(Customer c);
	public List<Customer> getAllCustomer();
	public String  deleteCustomer(int bookId);
}
