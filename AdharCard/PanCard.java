package com.xworkz.AdharCard;

public class PanCard extends AdharCard{
	public String panNo;
	
	public PanCard(String name, long adharNo, String dob, String address,String panNo) {
		super(name, adharNo, dob, address);
		this.panNo=panNo;
	}

	public void useFor() {
		System.out.println("use income tax");
	}
	
	public void displayInfoPan() {
		System.out.println("Pan No :"+panNo);
	}
	
}
