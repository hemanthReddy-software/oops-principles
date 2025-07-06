package com.development.oops;

public class CurrentAccount extends Account {

	public CurrentAccount(long accountnumber, double balance, String custmername) {
		super(accountnumber, balance, custmername);
		
	}

	public void calculate() {
		
		System.out.println("No interest for Current Account");

		
	}

	@Override
	public void calculateInterest() {
		
		
	}

		

}
