package com.exceptions;

public class InsufficientFundsExceptions extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientFundsExceptions() {
		super();
		
	}
	public InsufficientFundsExceptions(String msg) {
		super(msg);
	}
}
