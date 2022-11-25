package com.xworkz.examapp;

public class Exam {
	
	 public	HallTicket hallTicket;
	 public int fees;
	
	
	public boolean allow(HallTicket hallTicket) {
		boolean isAllowed= false;
		System.out.println("inside allow method");
		System.out.println("the fees paid is : " + this.fees);
		  if(fees >=1200) {
			  System.out.println("Fees is paid ");
			  if(hallTicket != null) {
			  this.hallTicket = hallTicket ;
			  System.out.println("Deatiles of candidtae HallTicket  are");
			  this.hallTicket.displayDetails() ;
			  isAllowed = true;
			  System.out.println("HallTicket is been issued :  now we can write exam");
			  
		  } 
	 else {
			  System.out.println("no hallTicket is found");	  
		 
		  }
	}
		  else {
			  System.out.println("first pay the fees");
			  
		  }
		return isAllowed;
	}

}
