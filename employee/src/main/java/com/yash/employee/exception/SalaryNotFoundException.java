package com.yash.employee.exception;

public class SalaryNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public SalaryNotFoundException(String message) {
		super(message);
	}

}
