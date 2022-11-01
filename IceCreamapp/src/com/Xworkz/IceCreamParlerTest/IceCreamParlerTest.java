package com.Xworkz.IceCreamParlerTest;

import com.Xworkz.IceCreamParler.IceCreamParler;

public class IceCreamParlerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long  ContectNo[]=new long[3];
		ContectNo[0]=99546543221L;
		ContectNo[1]=84546543221L;
		ContectNo[2]=97946543221L;
		
		 String noOfWorkers[]=new String[3];
		 noOfWorkers[0]="kiran";
		 noOfWorkers[1]="yoga";
		 noOfWorkers[2]="raju";
		 
		 String flavores[]=new String[3];
		 flavores[0]="venila";
		 flavores[1]="starbarry";
		 flavores[2]="mango";

		 IceCreamParler ice =new IceCreamParler("GST4565465465","DAIRY DAY","RAjajinagra",ContectNo,noOfWorkers,flavores);
		ice.displayInfo();
		 
		

	}

}
