package com.green.exception;

public class CompanyNotFoundException extends RuntimeException {

	public CompanyNotFoundException(String msg) {
		super(msg);
	}
}
