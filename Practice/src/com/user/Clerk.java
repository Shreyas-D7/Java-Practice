package com.user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.blogic.Bank;
import com.blogic.ShreyasBank;
import com.exceptions.InsufficientFundsExceptions;
import com.exceptions.InvalidAmountExceptions;
public class Clerk {

	public static void main(String[] args) {
		
		try {
			Bank acc = new ShreyasBank();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String option = "";
			
			do {
				try {
					System.out.println("\nchooose one option");
					System.out.println("1. Deposit");
					System.out.println("2. WithDraw");
					System.out.println("3.Balance Enquiry ");
					
					System.out.println("Enter Option : ");
					
					option = br.readLine();
					switch(option) {
					case "1":
					{
						System.out.println("Enter deposit amount : ");
						String  s = br.readLine();
						double amt = Double.parseDouble(s);
						
						acc.deposit(amt);
						acc.balanceEnquiry();
						
						break;
					}
					case "2":
					{
						System.out.println("Enter withdraw amount : ");
						String  s = br.readLine();
						double amt = Double.parseDouble(s);
						double withDrawAmt =acc.withdraw(amt); 
						System.out.println("withdrawn amount : "+withDrawAmt);
						acc.balanceEnquiry();
						
						break;
					}
					case "3":
					{
						
						acc.balanceEnquiry();
						
						break;
					}
					default:
						System.out.println("invalid option");
					}
				
				}
				catch(InvalidAmountExceptions ie) {
					System.out.println(ie.getMessage());
				}
				catch(InsufficientFundsExceptions e) {
					System.out.println(e.getMessage());
				}
				catch(NumberFormatException e) {
					System.out.println("please enter only number");
				}
				System.out.println("Do you want to continue : (yes/no)\n");
				option = br.readLine();
				if(option.equalsIgnoreCase("no")) {
				
					System.out.print("\n Thank You , have a nice day");
				}
			}
			
			
			while(option.equalsIgnoreCase("yes"));
		
			
		//	System.out.flush();
			
	}
		catch(IOException e) {
		e.printStackTrace();	
		}

}
}
