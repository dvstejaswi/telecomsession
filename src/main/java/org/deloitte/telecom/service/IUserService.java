package org.deloitte.telecom.service;

import org.deloitte.telecom.entities.Customer;

public interface IUserService {
	Customer findById(String mobileno);
	void addCustomer(Customer c);
	boolean credentialsCorrect(String mobileno, String password);

}
