package com.Xworkz.Finolex;



public class FinolexTest {
	
	public static void main(String[] args) {
		
		FinolexWiresDto feno=new FinolexWiresDto();
		feno.setId(1);
		feno.setCountryOrigin("India");
		feno.setAsin("B00PQIOAXB");
		feno.setManufacturer("Finolex");
		feno.setPrice(2500);
		feno.setWeight("25kg");
		feno.setModelNumber("ASERY46568");
		
		System.out.println(feno.getAsin()+" "+feno.getCountryOrigin()+" "+feno.getId()+" "+feno.getManufacturer()+" "+feno.getModelNumber()+" "+feno.getPrice()+" "+feno.getWeight());
		
	}

}
