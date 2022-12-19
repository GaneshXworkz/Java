package com.Xworkz.Beachapp;




public class BeachTest {
	
	public static void main(String[] args) {
		
		Beach beach=new Beach();
		
		beach.setAddress("rajajinagra");
		beach.setEntryFee(2000);
		beach.setGrade('A');
		beach.setId("456546TRG");
		beach.setName("Malpe");
		beach.setPhoneNo(4569565);
		beach.setRupees(5654);
		beach.setTravellingCharge(2000);
		
		System.out.println(beach.equals(beach));
		System.out.println(beach.hashCode());
		System.out.println(beach);
	    System.out.println("*******************************");
		
		Beach beach2=new Beach();
		beach2.setAddress("rajajinagra");
		beach2.setEntryFee(2000);
		beach2.setGrade('A');
		beach2.setId("456546TRG");
		beach2.setName("Malpe");
		beach2.setPhoneNo(4569565);
		beach2.setRupees(5000);
		beach2.setTravellingCharge(2000);
		
		
		System.out.println(beach2.equals(beach));
		System.out.println(beach2.hashCode());

		
	//class have reference of another class
		
		//diffrence between association and compositaion;
		
	}

}
