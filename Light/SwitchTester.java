package com.xworkz.Abstract.Light;

public class SwitchTester {
	
	public static void main(String[] args) {
		
		
		
		Switch sw=new TubeLightImpl();
		sw.sOff();
		sw.sOn();
		
		
		Switch sw1=new CflBulbImpl();
		sw1.sOff();
		sw1.sOn();
		
		
		
	}
	

}
