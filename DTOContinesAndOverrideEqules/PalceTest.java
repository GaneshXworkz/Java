package com.xworkz.Collection.DTOContinesAndOverrideEqules;

import java.util.ArrayList;
import java.util.Collection;

public class PalceTest {
	
	public static void main(String[] args) {
		
		
		PlaceDTO place1=new PlaceDTO("Mysore","Internationl","500");
		PlaceDTO place2=new PlaceDTO("hampi","Internationl","250");
		PlaceDTO place3=new PlaceDTO("Tajmahal","Internationl","1000");
		PlaceDTO place4=new PlaceDTO("GOa","Internationl","600");
		PlaceDTO place5=new PlaceDTO("Najanagudu","Local","350");
		
		
		Collection<PlaceDTO> place=new ArrayList();
		place.add(place1);
		place.add(place2);
		place.add(place3);
		place.add(place4);
		place.add(place5);
		
		
       
		boolean equals=place1.equals(place1);
		
		System.out.println("-------------------------------");

		System.out.println(place1.getName().equals(place1.getName()));
		
		System.out.println("-------------------------------");
		
		boolean contain=place.contains(place2);
		System.out.println("Containes : "+contain);
	}

}
