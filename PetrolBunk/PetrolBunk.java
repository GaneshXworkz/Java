package com.xworkz.PetrolBunk;

public class PetrolBunk {

	String Name;
	String cost;
	
	public String BrandName(String Name) {
		this.Name=this.Name+Name;
		System.out.println("barnd name :"+Name);
		return Name;	
	}
	
	public String perLiter(String cost) {
		this.cost=this.cost+cost;
		System.out.println(" Petrol cost :"+cost);
		return cost;	
	}

}
