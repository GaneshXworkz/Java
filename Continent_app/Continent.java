package com.xworkz.Continent_app;

public class Continent {
	
	public String name;
	public String noOfCountrys;
	
	
	public String ContinentName(String name) {
		this.name=this.name+name;
		System.out.println("Continent name :"+name);
		return name;	
	}
	
	public String noOfCountrys(String noOfCountrys) {
		this.noOfCountrys=this.noOfCountrys+noOfCountrys;
		System.out.println(" No of countrys :"+noOfCountrys);
		return noOfCountrys;	
	}

}
