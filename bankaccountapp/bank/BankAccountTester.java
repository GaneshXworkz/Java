package com.xworkz.bankaccountapp.bank;

import com.xworkz.bankaccountapp.CurrentAccount;
import com.xworkz.bankaccountapp.Kotak811;
import com.xworkz.bankaccountapp.SaveingsAccount;

public class BankAccountTester {

	public static void main(String[] args) {
		
		/*BankAccount draw=new BankAccount();
		draw.deposit(5000);
		draw.withDraw(250);
		draw.deposit(10000);
		draw.withDraw(2000);		
		draw.deposit(10000);
		System.out.println("balance :"+draw.balance);
		
		BankAccount frindsAccount=new BankAccount();
		
		frindsAccount.deposit(700);
		System.out.println("balance of frind's account before transfer"+frindsAccount.balance);
		draw.transfer(600,frindsAccount);
		System.out.println("balance of frind's account after transfer"+frindsAccount.balance);
		
		System.out.println("toatl Balance"+draw.balance);
		//inheritance : acquiring properties from one class to another class - i.e from parent to child class /super too sub class/
		// base to dirived class
		
		// is-a relationship
		//extends
		//class level
		
		/*
		SaveingsAccount save= new SaveingsAccount();
		 save.deposit(5000);
		 save.withDraw(2000);
		 System.out.println(save.balance);
		 
		 SaveingsAccount maaAccount=new SaveingsAccount();
		 maaAccount.deposit(1000);
		 save.transfer(20000, maaAccount);
		 
		 System.out.println(maaAccount.balance);*/
		 //******************************************************************************//*
		/* CurrentAccount curr=new CurrentAccount();
		 curr.deposit(1000);
		 curr.withDraw(200);
		System.out.println(curr.balance);
		  
		 CurrentAccount newAccount=new CurrentAccount();
		 newAccount.deposit(100);
		 curr.transfer(50, newAccount);
		 System.out.println(newAccount.balance);*/
		 
		 
		 
		 /*********************************************************************************/
		 
		 SaveingsAccount sve=new SaveingsAccount(0.7);
		 sve.deposit(1000);
		 sve.periodicInterest();
		 System.out.println(sve.getBalance());
		 System.out.println(sve.interstRate);
		 
		 
		 
		 
		 

		 
				 
		 
	}

}
