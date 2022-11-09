package com.xworkz.bankaccountapp;

import com.xworkz.bankaccountapp.bank.BankAccount;

public class SaveingsAccount extends BankAccount{
	
	public double interstRate;
	
	public SaveingsAccount() {
		
	}
		public SaveingsAccount(double interstRate) {
			this.interstRate=interstRate;
		}
	
	public void periodicInterest() {
		double newBalance =getBalance()*interstRate/100;
		deposit(newBalance);
	}
		

}
