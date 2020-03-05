package com.javacodegeeks.tdd.password.verify;

public class PasswordCustomException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	String exception;

	public PasswordCustomException(String exception) {

		this.exception = exception;
	}

}
