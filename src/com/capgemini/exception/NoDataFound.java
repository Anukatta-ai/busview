package com.capgemini.exception;

//NoDataFound is user defined Exception class
public class NoDataFound extends RuntimeException {
	
	//The following method is used to write message in our user defined exception
	public NoDataFound(String msg) {
		super(msg);
	}
}
