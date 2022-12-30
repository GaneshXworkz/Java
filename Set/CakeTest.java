package com.xworkz.Collection.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class CakeTest {
	
	public static void main(String[] args) {
		 
		CakeDTO cake1=new CakeDTO("Srtabarry","red",780.00);
		CakeDTO cake2=new CakeDTO("venila","blue",800.00);
		CakeDTO cake3=new CakeDTO("mango","yellow",900.00);
		CakeDTO cake4=new CakeDTO("Orange","orange",850.00);
		CakeDTO cake5=new CakeDTO("Srtabarry","red",780.00);
		
		Set<CakeDTO> set=new LinkedHashSet();
		set.add(cake1);
		set.add(cake2);
		set.add(cake3);
		set.add(cake4);
		set.add(cake5);
		
		for(Object ref:set) {
			System.out.println(ref);
			System.out.println(ref.hashCode());
			System.out.println(System.identityHashCode(ref));
			System.out.println("-----------------------------");
		}
		
		
	}

}
