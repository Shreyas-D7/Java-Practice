package com.blogic;

import com.exceptions.InsufficientFundsExceptions;
import com.exceptions.InvalidAmountExceptions;

public class ShreyasBank implements Bank {

	private double balance;

	public void deposit(double amt) throws InvalidAmountExceptions {

		if (amt <= 0) {
			throw new InvalidAmountExceptions(amt + " is invalid amount");
		}

		balance = balance + amt;
	}

	
	public double withdraw(double amt) throws InvalidAmountExceptions, InsufficientFundsExceptions {

		if (amt <= 0) {
			throw new InvalidAmountExceptions(amt + "is invalid amount");
		}
		if (balance < amt) {
			throw new InsufficientFundsExceptions("insufficient funds");
		}
		balance = balance - amt;
		return amt;
	}

	public void balanceEnquiry() {
		System.out.println("current  balance : " + balance +"\n");
	}

}
