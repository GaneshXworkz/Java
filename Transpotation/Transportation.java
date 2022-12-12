package com.xworkz.Abstract.Transpotation;

public class Transportation {
	
	 RedBusContract redbusContract  ; 
	 
	 int noOfBooking;
		
	    String name = "Sri Durga parameshawari";
	
	   public boolean bookings(RedBusContract contract) 
	   {
		   boolean isBooking=false;
		System.out.println("Inside booking method");
		
		boolean condition= contract.conditionOfBus();
		if(condition==true) 
		{
			System.out.println("bus is good Condition");
			
			if(noOfBooking<=contract.minBookings())
			{
				System.out.println("No of bookings is "+ noOfBooking);
				System.out.println("Thank You for Booking the ticket through"+ name);
			}else 
			{
				System.out.println("Cannot procced with Booking as noOfBooking ");
			}
			
		}
		else {
				System.out.println("Cannot proceed with Booking as Bus is Not in Good Condition");
		}
		
		return isBooking;
	   }
	   
	   


}
