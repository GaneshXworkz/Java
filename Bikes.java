package com.xworkz.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Bikes {
	
	public static void main(String[] args) {
		
		String bike1="Honda Shine";
		String bike2="Hero";
		String bike3="Yamaha";
		String bike4="Bajaj";
		String bike5="Suzuki";
		String bike6="Royal Enfield";
		String bike7="TVS";
		String bike8="BMW";
		String bike9="Ravan";
		String bike10="Bimoto";
		String bike11="Forger";
		String bike12="Panther";

		String bike13="Phoenix";
		String bike14="Ebony";
		String bike15="Stiletto";
		String bike16="KermitRoketmen";
		String bike17="Panther";
		String bike18="Nova";
		
		
		Collection<String> collect =new ArrayList();
		collect.add(bike1);
		collect.add(bike2);
		collect.add(bike3);
		collect.add(bike4);
		collect.add(bike5);
		collect.add(bike6);
		collect.add(bike7);
		collect.add(bike8);
		collect.add(bike9);
		collect.add(bike10);
		collect.add(bike11);
		collect.add(bike12);
		collect.add(bike13);
		collect.add(bike14);
		collect.add(bike15);
		collect.add(bike16);
		collect.add(bike17);
		collect.add(bike18);
		
		
	    System.out.println("Before clear");

		System.out.println(collect);

		System.out.println(collect.size());
		
	    collect.clear();
	    
	    System.out.println("After clear");
	    
	    System.out.println(collect);
	  
	    System.out.println(collect.size());
		

	}

}
