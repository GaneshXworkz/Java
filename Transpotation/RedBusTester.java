package com.xworkz.Abstract.Transpotation;

public class RedBusTester {

	public static void main(String[] args) 
	{
		
		
		RedBusContract redbus=new VrlImpl();
		Transportation tra=new Transportation();
		tra.noOfBooking=1;
		tra.name="Ganseh";
		tra.bookings(redbus);
	
		
		
		/*
		 * --->ABSTRACTION`
		 * hiding the implemationA and allowing the users to access only the
		 * functionality with the help of interface 
		 * --->LOOSE COUPLING 
		 * --->TIGHT COUPLING
		 */
		
		
	}
}
