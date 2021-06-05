package com.exceptions;

public class InvalidAmountExceptions extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAmountExceptions() {
		super();
	}
	
	public InvalidAmountExceptions(String msg) {
		super(msg);
	}
}
