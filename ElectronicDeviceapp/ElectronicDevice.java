package com.xworkz.ElectronicDeviceapp;

public class ElectronicDevice {
	
	String brandname;
	
	public String brandName(String brandname) {
		this.brandname+=brandname;
		System.out.println("Brand Name :" +brandname);
		return brandname;
	}

	public void useFor() {
		System.out.println("use for maultiple work ");
	}
	
}
