package com.xworkz.Collection.ForEachLoopAndIterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCityName {
	

	public static void main(String[] args) {
		
		String metro1="Kuvempu Metro Station";
		String metro2="Mejastic ";
		String metro3="Rajarajesweri nagara";
		String metro4="J P nagara";
		String metro5="Vidanasoudha";
		
		Collection<String> metro=new ArrayList<String>();
		metro.add(metro1);
		metro.add(metro2);
		metro.add(metro3);
		metro.add(metro4);
		metro.add(metro5);
		
		for(String ref:metro) {
			System.out.println(ref);
		}
		
		System.out.println("======ITERATATOR=====");
		
		Iterator<String> ite=metro.iterator();
		
		while(ite.hasNext()) {
			
			String element= ite.next();
			System.out.println(element);
		}
		
		
	}

}
