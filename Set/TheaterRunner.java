package com.xworkz.Collection.Set;


import java.util.LinkedHashSet;
import java.util.Set;

public class TheaterRunner {
	
	public static void main(String[] args) {
		
		TheaterDTO ref1=new TheaterDTO("Oreain Mall","Avathar",250.00,"Rajajinagra");
		TheaterDTO ref2=new TheaterDTO("lulu Mall","veda",250.00,"Yaswantapur");
		TheaterDTO ref3=new TheaterDTO("Navarang theater","Avathar",500.00,"Mejastic");
		TheaterDTO ref4=new TheaterDTO("Ashoka theater","Avathar",600.00,"Dasarhalli");
		TheaterDTO ref5=new TheaterDTO("Oreain Mall","Avathar",600.00,"Rajajinagra");
		
		Set<TheaterDTO> set=new LinkedHashSet();
		set.add(ref1);
		set.add(ref2);
		set.add(ref3);
		set.add(ref4);
		set.add(ref5);
		
		for(Object ref:set) {
			
			System.out.println(ref);
			System.out.println("Overrided : "+ref.hashCode());
			System.out.println("Original HashCode by JVM : "+System.identityHashCode(ref));
			System.out.println("----------------------------------------");
		}
	}

}
