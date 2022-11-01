package com.xworkz.resortapp;

public class IronBox {
	
	String id;
	String name;
	String type;
	String prize;
	
	IronBox(){
		
	}
	
	public IronBox(String id, String name, String type, String prize) {
		this.id=id;
		this.name=name;
		this.type=type;
		this.prize=prize;
		
	}
	public void toRemoveWrinkals(){
		System.out.println("shirt will iron");
	}
	
	
	

}
