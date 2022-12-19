package com.Xworkz.Vegetables;

public class VegetableTester {
	
public static void main(String[] args) {
		
	Vegetables veg=new Vegetables();
	veg.setVegname("Tomato");
	veg.setCompanyAddress("Rajajinagra");
	veg.setPhoneNo(98756213233L);
	veg.setVeggrade('A');
	veg.setRupees(50);
	veg.setVegCharge(5000);
	veg.setCompanyid("1235DVGH");
	
     System.out.println(veg);	
     System.out.println(veg.equals(veg));
     System.out.println(veg.hashCode());
		
	
		
		
	}



}
