package com.xworkz.UnionTerritoryApp;

public class UnionTerritory {
	
	public String name;
	public int pincode;
	public String favouretPlace;
	
	
	public String territoryName(String name) {
		this.name=this.name+name;
		return name;
	}
	
	public int pincode(int pincode) {
		this.pincode=this.pincode+pincode;
		return pincode;
	}
	
	public String goodPlace(String favouretPlace) {
		this.favouretPlace=this.favouretPlace +favouretPlace;
		return favouretPlace;
	}
	
	
}
