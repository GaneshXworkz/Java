package com.xworkz.fruitApp;

public class Fruit {
	 
	public String name;
	public String colour;
	
	
	public String name(String name) {
		this.name+= name;
		System.out.println("Fruit name is :"+ name);
		return name;
	}
	
	public String colour(String colour) {
		this.colour+= colour;
		System.out.println("Fruit colour is :"+ colour);
		return colour;
	}
}
