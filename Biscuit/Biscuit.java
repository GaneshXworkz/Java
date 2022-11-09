package com.xworkz.Biscuit;

public class Biscuit {

	String name;
	
	public String biscuteName(String name) {
		this.name=this.name+name;
		System.out.println("Biscute name :"+name);
		return name;	
	}
	
	
	public void goodFor() {
		System.out.println("Good Helth");
	}
}
