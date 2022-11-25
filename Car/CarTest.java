package com.xworkz.Car;

public class CarTest {

	public static void main(String[] args) {
		
		TataIndica tata=new TataIndica(3,200,50);
		tata.applyBreak(2);
		tata.speedUp(2);
		
		
		System.out.println(tata.toString());
		
	}
}
