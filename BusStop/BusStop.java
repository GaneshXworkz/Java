package com.xworkz.BusStop;

public class BusStop {

	String name;
	String charge;
	
	public String BustopName(String name) {
		this.name=this.name+name;
		System.out.println("Writer name :"+name);
		return name;	
	}
	
	public String BusCharge(String charge) {
		this.charge=this.charge+charge;
		System.out.println(" Petrol cost :"+charge);
		return charge;	
	}
	
}
