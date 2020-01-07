package org.deloitte.telecom.dao;

import org.deloitte.telecom.entities.Customer;

public interface IUserDao {
	Customer findById(String mobileno);
	void addCustomer(Customer c);
	boolean credentialsCorrect(String mobileno, String password);
}
