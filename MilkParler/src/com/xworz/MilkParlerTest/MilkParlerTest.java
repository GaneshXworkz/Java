package com.xworz.MilkParlerTest;

import com.xworkz.MilkParler.MilkParler;

public class MilkParlerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MilkParler milk=new MilkParler();
		milk.name="Nandini MilkParler";
		milk.address="Rajajinagra";
		milk.contctNo=96456813213L;
		milk.noOfWorkers=3;
		
		String flavors[]=new String[3];
		flavors[0]="Lussy";
		flavors[1]="milk";
		flavors[2]="badam milk";
		
		String staffName[]=new String[3];
		staffName[0]="ravi";
		staffName[1]="mahi";
		staffName[2]="rohan";
		
		
		System.out.println(milk.name,milk.address,milk.contctNo,milk.noOfWorkers,flavors,staffName);
		System.out.println(MilkParler.toStore());
		

		

	}

}
