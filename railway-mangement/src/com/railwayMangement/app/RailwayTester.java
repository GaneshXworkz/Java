package com.railwayMangement.app;

public class RailwayTester {
	
	//staic is consider to be as single copy class
	//instanc consider  to be as multiple copy of object
	
	//static member can be shared among multiple object;
	
	//instance member cannot be sheard among multiple objects
	
	public static void main(String[] args) {
	
	Railway ref=new Railway("AWS1234","person","Z++");
	System.out.println("employ Detailes");
	System.out.println(ref.idname+" "+ref.name+" "+ref.bloodGroup);
	
	
	//IceCream--
	//IronBox --Id , name , type
//	Footwear --id,size,color,model, brandname
	//watch ---id,color,price,brandNmae,type
	//softDrink --id,name, price, flavor, quantity
	
	
	
	
}
}
