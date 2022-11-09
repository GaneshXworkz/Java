package com.xworkz.Flower;

public class Flower {

	public String name;
	public String color;
	
	public String name(String name) {
		this.name=this.name+name;
		System.out.println("floer name is : "+ name);
		return name;
		
	}
	public String color(String color) {
		this.color=this.color+color;
		System.out.println("flower color is : "+color);
		return color;
	}


}
