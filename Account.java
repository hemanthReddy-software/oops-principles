package com.development.oops;



public abstract class  Account {
 private long accountnumber;
 protected double balance;
 private  String custmername;
 
public Account(long accountnumber, double balance, String custmername) {
	
	this.accountnumber = accountnumber;
	this.balance = balance;
	this.custmername = custmername;
}
public long getAccountnumber() {
	return accountnumber;
}
public void setAccountnumber(long accountnumber) {
	this.accountnumber = accountnumber;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public String getCustmername() {
	return custmername;
}
public void setCustmername(String custmername) {
	this.custmername = custmername;
}
public void deposite( double amount)
{   

	balance=balance+amount;
	System.out.println("balance after debiting "+amount+" is "+balance);
	
	
	
}
@SuppressWarnings("resource")
public void withdraw(double amount)
{

	
	 balance=balance-amount;
	 System.out.println("after withdrawing "+amount+" your balance is "+balance);
	 
	 
	 
	
}
public abstract void calculateInterest();
public abstract void calculate();





	}


