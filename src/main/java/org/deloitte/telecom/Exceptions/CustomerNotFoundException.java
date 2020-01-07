package org.deloitte.telecom.Exceptions;

public class CustomerNotFoundException extends RuntimeException{
	public CustomerNotFoundException(String msg) {
        super(msg);
}

}
