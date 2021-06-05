package com.blogic;

import com.exceptions.InsufficientFundsExceptions;
import com.exceptions.InvalidAmountExceptions;

public interface Bank {

	public void deposit(double amt) throws InvalidAmountExceptions;
	
	public double withdraw(double amt)throws InvalidAmountExceptions,InsufficientFundsExceptions;

	public void balanceEnquiry();
}
