package com.xworkz.Collection.ForEachLoopAndIterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Animals {
	
	public static void main(String[] args) {
		
		String animal1="Lion";
		String animal2="Tiger";
		String animal3="CAT";
		String animal4="DOG";
		String animal5="ELEPHANT";
		String animal6="DEER";
		String animal7="COW";
		String animal8="OX";
		String animal9="CORCODIAL";
		String animal10="MONKEY";
		
		Collection<String> col=new ArrayList<String>();
		col.add(animal1);
		col.add(animal2);
		col.add(animal3);
		col.add(animal4);
		col.add(animal5);
		col.add(animal6);
		col.add(animal7);
		col.add(animal8);
		col.add(animal9);
		col.add(animal10);
		
		for(String ref :col) 
		{
			System.out.println(ref);
			
		}
		
		System.out.println("==============Iterator=========");
		
		
		Iterator<String> animal=col.iterator();
		
		while(animal.hasNext())
		{
			String element =animal.next();
			
			System.out.println(element);
		}

	}

}
