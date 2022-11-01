package com.xworkz.hotelTester;


import com.xworkz.hotel.Hotel;

public class HotelTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long  ContectNo[]=new long[3];
		ContectNo[0]=95146543221L;
		ContectNo[1]=99846543221L;
		ContectNo[2]=78946543221L;
		
		 String noOfWorkers[]=new String[3];
		 noOfWorkers[0]="ram";
		 noOfWorkers[1]="ravi";
		 noOfWorkers[2]="rohan";
		 
		 String food[]=new String[3];
		 food[0]="Dosa";
		 food[1]="Idli";
		 food[2]="Pulava";

		 Hotel ice =new Hotel("GST4565465465","DAIRY DAY","RAjajinagra",ContectNo,noOfWorkers,food);
		ice.displayInfo();
		 
		

	}
		
	}


