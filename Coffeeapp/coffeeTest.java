package com.xworkz.Coffeeapp;

public class coffeeTest {
	
	public static void main(String[] args) {
		
		coffee coff=new coffee();
		coff.coffeeName("Levista");
		coff.cost(500);
		coff.flavour("Shunti and Cordamom");
		coff.makeA();
		
		Redlable red= new Redlable();
		red.coffeeName("RedLable");
		red.cost(250);
		red.flavour("Thulasi and cardamom");
		red.makeA();
		
	}

}
