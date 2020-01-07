package org.deloitte.telecom.service;

import org.deloitte.telecom.Exceptions.IncorrectIdException;
import org.deloitte.telecom.dao.IUserDao;
import org.deloitte.telecom.dao.UserDaoImpl;
import org.deloitte.telecom.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements IUserService {

	private IUserDao dao = new UserDaoImpl();
	
	public UserServiceImpl(IUserDao dao) {
		this.dao = dao;
	}


		
		 @Override
		 public void addCustomer(Customer c) {
			 dao.addCustomer(c);
		 }
		
		
		@Override
		public Customer findById(String mobileno) {
			if(mobileno==null || mobileno.length()!=10) {
				throw new IncorrectIdException("incorrect id");	
			}
			Customer c=dao.findById(mobileno);
			return c;
		}
		
		 @Override
		    public boolean credentialsCorrect(String mobileno, String password) {
		        boolean correct = dao.credentialsCorrect(mobileno, password);
		        return correct;
		    }

	}



