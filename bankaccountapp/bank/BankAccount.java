package com.xworkz.bankaccountapp.bank;

public class BankAccount {
	
	public String name;
	String ifscCode;
	String branchName;
	String accountNo;
	private double balance;
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
		
	}

	
	
	public double withDraw(double balance) {
		
	System.out.println("this amount is withDrwan");
		this.balance =this.balance-balance;
		return this.balance;	
	}
	
	public double deposit(double balance) {
		System.out.print("this amount to be deposited");
		this.balance=this.balance+balance;
		return this.balance;
	}
	
	public void transfer(double amount, BankAccount frindsAccount) {
		System.out.println("TRansfering to frins account");
		withDraw(amount);
		frindsAccount.deposit(amount);
		System.out.println("transfering done... Transaction successful");
		
	}
	
	
	
	
	
	
	
	

}
