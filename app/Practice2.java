package com.practic.app;

public class Practice2 {
	
	String names[]=new String[10];
	int i;
	
	
	public void setName(String name) {
		if(names!=null && names.length>i) {
			names[i++]=name;
			return;	
		}
		else {
			System.out.println("bed ella....");
		}
		return;
	}
	
	


}
