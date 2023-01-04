package com.xworkz.Collection.FunctionInterfaceAndStream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class PlaceTest {
	
	public static void main(String[] args) {
	
		Collection<PlaceDTO> place=new ArrayList();
		place.add(new PlaceDTO("Banglore Palace","Banglore","RAVI",false,500));
		place.add(new PlaceDTO("mysore Palace","mysore","Ramu",false,150));
		place.add(new PlaceDTO("lila Palace","Banglore","ramesh",false,600));
		place.add(new PlaceDTO("Jaipur Palace","jaipur","Rohan",true,2000));
		place.add(new PlaceDTO("Delhi Palace","Delhi","Sultan",true,3000));

		
		
		System.out.println("Not Destroyed");
		
		place
		.stream()
		.filter(dto->!dto.isDestroyed())
		.collect(Collectors.toSet())
		.forEach(dto-> System.out.println(dto));
		
		System.out.println();
		System.out.println("-----------------------------------");
		
		
		
		
		
		
	}

}
