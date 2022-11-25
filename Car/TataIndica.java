package com.xworkz.Car;

public class TataIndica extends Car {
	
	public int storgeTank;
	
	public TataIndica(int gare, int speed,int storgeTank) {
		super(gare, speed);
		this.storgeTank=storgeTank;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return(super.toString()+"STORAGE TANK : " +storgeTank );
	}
	
	
}
