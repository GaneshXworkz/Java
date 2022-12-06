package com.xworkz.AdharCard;

public class AdharCard {
	//multi-level inhetance;
	public String name;
	public long adharNo;
	public String dob;
	public String address;
	
	
	public AdharCard(String name, long adharNo, String dob, String address) {
		super();
		this.name = name;
		this.adharNo = adharNo;
		this.dob = dob;
		this.address = address;
	}
	
	public void displyInfo() {
		System.out.println(" Name : "+name);
		System.out.println(" Adhar No : "+adharNo);
		System.out.println(" Date Of Birth  : "+dob);
		System.out.println(" Address : "+address);
	}

	
	
	
	
}
