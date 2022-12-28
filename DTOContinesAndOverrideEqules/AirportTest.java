package com.xworkz.Collection.DTOContinesAndOverrideEqules;

import java.util.ArrayList;
import java.util.Collection;

public class AirportTest {
	
	public static void main(String[] args) {
		
		Airport airport1=new Airport("Banglore Airport","International",2000);
		Airport airport2=new Airport(" Manglore Airport","International",1256);
		Airport airport3=new Airport("Hubli  Airport","Domastic",200);
		Airport airport4=new Airport("Mysore  Airport","Domastic",250);
		Airport airport5=new Airport("Shivamogga  Airport",null,300);

		Collection<Airport> airport =new ArrayList<Airport>();
		airport.add(airport5);
		airport.add(airport4);
		airport.add(airport3);
		airport.add(airport2);
		airport.add(airport1);
		
		boolean equals=airport4.equals(airport4);
		System.out.println(airport1.getName().equals(airport1.getName()));	
		
		boolean contain=airport.contains(airport4);
		System.out.println("Containes : "+contain);
	}

}
