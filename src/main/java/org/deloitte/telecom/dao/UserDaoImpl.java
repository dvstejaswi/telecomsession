package org.deloitte.telecom.dao;

import org.deloitte.telecom.Exceptions.CustomerNotFoundException;
import org.deloitte.telecom.entities.Customer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDaoImpl implements IUserDao {

	private Map<String, Customer> store = new HashMap<>();

	public UserDaoImpl() {
		Customer c1 = new Customer("teju", "7893378000", "t", 100);
		store.put("7893378000", c1);
		Customer c2 = new Customer("sara", "7893389000", "s", 200);
		store.put("7893389000", c2);
	}

	@Override
	public void addCustomer(Customer c) {
		store.put(c.getMobileno(), c);
	}

	@Override
	public Customer findById(String mobileno) {
		Customer c = store.get(mobileno);
		if (c == null) {
			throw new CustomerNotFoundException("customer not found =" + mobileno);
		}
		return c;
	}

	@Override
	public boolean credentialsCorrect(String mobileno, String password) {
		Customer user = store.get(mobileno);
		if (user == null) {
			return false;
		}
		return user.getPassword().equals(password);
	}

}
