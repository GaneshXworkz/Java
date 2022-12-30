package com.xworkz.Collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;

public class SweetRunner {
	
	public static void main(String[] args) {
		
		SweetDTO sweet1=new SweetDTO("Kaju Burfi","red",700.00,"Round");
		SweetDTO sweet2=new SweetDTO("Badam Burfi","white",600.00,"Round");
		SweetDTO sweet3=new SweetDTO(" Burfi","orange",850.00,"Round");
		SweetDTO sweet4=new SweetDTO("Kaju Burfi","green",600.00,"Round");
		SweetDTO sweet5=new SweetDTO("Badam Burfi","white",600.00,"Round");

		Set<SweetDTO> sweet=new LinkedHashSet();
		sweet.add(sweet1);
		sweet.add(sweet2);
		sweet.add(sweet3);
		sweet.add(sweet4);
		sweet.add(sweet5);
		
		for(Object ref:sweet) {
			System.out.println(ref);
			System.out.println("Overriden : "+ref.hashCode());
			System.out.println("Orignal  given by Jvm: "+System.identityHashCode(ref));

		}
		
		//ListIterator<SweetDTO> ite=new ListIterator<SweetDTO>(size()-1);
		
		
	}



}
