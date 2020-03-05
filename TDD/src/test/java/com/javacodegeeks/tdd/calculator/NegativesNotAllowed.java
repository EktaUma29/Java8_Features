package com.javacodegeeks.tdd.calculator;

public class NegativesNotAllowed extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public NegativesNotAllowed(String exceptionMessage) {
		super(exceptionMessage);
	}

}
