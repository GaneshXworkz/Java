package com.railwayMangement.app;

public class Railway {
	
	String idname;
	String name;
	String bloodGroup;
	static String companyname ="amazon";
	
	public  Railway() {
		//TODO Auto-generated constructor stub
		
	}
	
	public Railway(String empid, String nm, String bgrop) {
		System.out.println("Employee object is created");
		idname= empid;
		name=nm;
		bloodGroup= bgrop;	
	}
	

	
}

