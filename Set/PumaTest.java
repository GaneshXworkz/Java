package com.xworkz.Collection.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class PumaTest {
	
	public static void main(String[] args) {
		
		PumaDTO puma1=new PumaDTO("Puma sports","red",10);
		PumaDTO puma2=new PumaDTO("Puma casual","blue",8);
		PumaDTO puma3=new PumaDTO("Puma football","sky blue",9);
		PumaDTO puma4=new PumaDTO("Puma cricket","white",11);
		PumaDTO puma5=new PumaDTO("Puma sports","red",10);
	
		
		Set<PumaDTO> set=new LinkedHashSet();
		set.add(puma1);
		set.add(puma2);
		set.add(puma3);
		set.add(puma4);
		set.add(puma5);
		
		
		for(Object ref:set) {
			System.out.println(ref);
			System.out.println("Override : "+ref.hashCode());
			System.out.println("Hash Code By jvm : "+System.identityHashCode(ref));
			System.out.println("----------------------------------------");
		}
	}

}
