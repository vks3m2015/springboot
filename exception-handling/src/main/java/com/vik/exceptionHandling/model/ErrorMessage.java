package com.vik.exceptionHandling.model;

import java.util.Date;

//@Value
//@Builder
public class ErrorMessage {
	
	int statusCode;
	Date timestamp;
	String message;
	String description;
	public ErrorMessage(int statusCode, Date timestamp, String message, String description) {
		super();
		this.statusCode = statusCode;
		this.timestamp = timestamp;
		this.message = message;
		this.description = description;
	}

	
	
}
