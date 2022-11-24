package com.Xworkz.Amezon;



public class AmezonTest {
	
	public static void main(String[] args) {
		
		Amezon amezon=new Amezon();
		
		amezon.setName("malpe");
		amezon.setAddress("Rajajinagra");
		amezon.setPhoneNo(98756213233L);
		amezon.setId("ghjh");
		amezon.setNoOfProductes(100);
		amezon.setMinFee(455);
		amezon.setComoanyGrade('A');
		
		System.out.println(amezon.getAddress()+" "+amezon.getComoanyGrade()+" "+amezon.getId()+" "+amezon.getMinFee()+" "+amezon.getName()+" "+amezon.getNoOfProductes()+" "+amezon.getPhoneNo());
		
		
	
		
		
	}
	
}
