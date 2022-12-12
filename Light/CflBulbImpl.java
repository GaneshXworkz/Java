package com.xworkz.Abstract.Light;

public  class CflBulbImpl implements Switch{
	
	@Override
	public void sOn() {
		System.out.println("CFL bulb is on...");
	}

	@Override
	public void sOff() {
		
		System.out.println("CFL bulb is Off....");
	}
	
	public void lightColour() {
		System.out.println("orange");
	}

}
