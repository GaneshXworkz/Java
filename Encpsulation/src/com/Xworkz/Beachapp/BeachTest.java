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
		
		System.out.println(beach.getAddress()+"\n "+beach.getEntryFee()+"\n "+beach.getRupees()+"\n "+beach.getName()+" \n"+beach.getId()+"\n"+beach.getTravellingCharge()+" \n"+beach.getGrade()+"\n"+beach.getRupees());
	
	
		
	}

}
