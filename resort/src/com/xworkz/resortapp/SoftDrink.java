package com.xworkz.resortapp;

public class SoftDrink {
	
	String id,name, price, flavor, quantity;
	static String madein="made in INDIA";
	
	
	SoftDrink(){
		
	}
	
	public SoftDrink(String id,String name, String price,String flavor,String quantity) {
		this.id=id;
		this.name=name;
		this.price=price;
		this.flavor=flavor;
		this.quantity=quantity;	
	}
	
	public static void toDrink() {
		System.out.println("feel relax");
	}

}
