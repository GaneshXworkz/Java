package com.Xworkz.bike;

import com.Xworkz.Car.Car;

public class BikeTest {
	
public static void main(String[] args) {
		
		Bike bike=new Bike();
		bike.setName("ROYAL ENFIELD");
		bike.setCompanyAddress("Rajajinagra");
		bike.setEntryFee(5000);
		bike.setPhoneNo(98756213233L);
		bike.setCompanygrade('A');
		bike.setRupees(6000);
		bike.setExpensiveCharge(200);
	
		
       System.out.println(bike);
       System.out.println(bike.hashCode());
       System.out.println(bike.equals(bike));
		
		
		
	}
	


}
