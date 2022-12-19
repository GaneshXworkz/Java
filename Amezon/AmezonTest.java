package com.Xworkz.Amezon;



public class AmezonTest {
	
	public static void main(String[] args) {
		
		Amezon amezon=new Amezon();
		
		amezon.setName("malpe");
		amezon.setAddress("Rajajinagra");
		amezon.setPhoneNo(98756213233L);
		amezon.setId(123456);
		amezon.setNoOfProductes(100);
		amezon.setMinFee(455);
		amezon.setComoanyGrade('A');
		
		System.out.println(amezon.hashCode());
		System.out.println(amezon);
		
		System.out.println("******************************");
		System.out.println(amezon.equals(amezon));
		System.out.println("******************************");
		System.out.println(amezon.equals(amezon));
       Amezon amezon1=new Amezon();
		
		amezon.setName("Gokarna");
		amezon.setAddress("Sirasi");
		amezon.setPhoneNo(98756213233L);
		amezon.setId(456789);
		amezon.setNoOfProductes(200);
		amezon.setMinFee(600);
		amezon.setComoanyGrade('B');
		
		System.out.println(amezon1.hashCode());
		System.out.println(amezon1);
		System.out.println("******************************");

		
		
		
	}
	
}
