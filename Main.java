package com.development.oops;

public class Main {

	public static void main(String[] args) {
		 Account acc1 =  new CurrentAccount(1001, 5000.00,"Alice");
	        Account acc2 = new SavingsAccount(1002, 8000.00,"Bob");

	        acc1.deposite(1000.00);
	        acc1.withdraw(2000.00);
	        acc1.calculateInterest();

	        System.out.println("-------------------");

	        acc2.deposite(2000.00);
	        acc2.withdraw( 1000.00);
	        acc2.calculateInterest();
	    }
	


	}


