package com.Xworkz.Finolex;



public class FinolexTest {
	
	public static void main(String[] args) {
		
		FinolexWiresDto feno=new FinolexWiresDto();
		feno.setName("Finolex");
		feno.setId(1);
		feno.setCountryOrigin("India");
		feno.setAsin("B00PQIOAXB");
		feno.setManufacturer("Finolex");
		feno.setPrice(2500);
		feno.setWeight("25kg");
		feno.setModelNumber("ASERY46568");
		
		
		System.out.println(feno);
		System.out.println(feno.hashCode());
		System.out.println(feno.equals(feno));
		
	}

}
