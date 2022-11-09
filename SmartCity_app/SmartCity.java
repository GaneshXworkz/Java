package com.xworkz.SmartCity_app;

public class SmartCity {
	
	public String smartCityname;
	public String developmentCost;
	
	public String smartCityname(String smartCityname) {
		this.smartCityname+=smartCityname;
		System.out.println(" smart City name  is :" +smartCityname);
		return smartCityname;
	}
	public double developmentCost(double developmentCost) {
		this.developmentCost+=developmentCost;
		System.out.println(" SmartCity development Cost is :" + developmentCost);
		return developmentCost;
	}
	

}
