package com.vik.exceptionHandling.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	ResourceNotFoundException(String msg){
		super(msg);
	}

}
