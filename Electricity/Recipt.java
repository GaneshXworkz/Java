package com.xworkz.Electricity;

public class Recipt {
	public String billId;
	public String date;
	public String name;
	public double amount;
	
	public Recipt(String billId, String date, String name, double amount) {
		super();
		this.billId = billId;
		this.date = date;
		this.name = name;
		this.amount = amount;
	}

	public void displyInfo() {
		System.out.println(" Bill Id : "+billId);
		System.out.println(" Bill date : "+date);
		System.out.println(" Bill Name  : "+name);
		System.out.println(" Bill Amount : "+amount);
	}
	

}
