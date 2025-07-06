package com.development.oops;

public class SavingsAccount extends Account {

	public SavingsAccount(long accountnumber, double balance, String custmername) {
		super(accountnumber, balance, custmername);
		
	}

	
		
	

	@Override
	public void calculateInterest() {
		 double interest = getBalance() * 0.04; 
	        System.out.println("Savings Interest: " + interest);
	    }

	@Override
	public void calculate() {
		
		
	}

	
	

	


		

	}


