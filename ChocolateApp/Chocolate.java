package com.xworkz.ChocolateApp;

public class Chocolate {
	
	public String name;
	public double amount;
	
	public String ChocolateName(String name) {
		this.name+=name;
		System.out.println(" Chocolate Name  :" +name);
		return name;
	}
	public double amount(double amount) {
		this.amount+=amount;
		System.out.println("Chocolate cost :" + amount);
		return amount;
	}
	

}
