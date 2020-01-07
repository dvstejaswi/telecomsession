package org.deloitte.telecom.dto;

import org.deloitte.telecom.entities.Customer;
import org.springframework.stereotype.Component;

public class SessionData {

	 private Customer user;

	    public void setUser(Customer user){
	        this.user=user;
	    }

	    public Customer getUser(){
	        return user;
	    }

	}





