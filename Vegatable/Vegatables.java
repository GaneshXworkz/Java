package com.xworkz.Vegatable;

public class Vegatables {
	
	String name;
	
	
	public String vegatableName(String name) {
		this.name=this.name+name;
		System.out.println("Vegatable name :"+name);
		return name;	
	}

	public void veatableFor() {
		System.out.println("Cooking");
	}

}
