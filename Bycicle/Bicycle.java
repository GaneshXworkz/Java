package com.xworkz.Bycicle;

public class Bicycle {
	
	public int gare;
	public int speed;
	
	
	//bicycle class has one constructors
	public Bicycle(int gare, int speed) {
		this.gare=gare;
		this.speed=speed;
		
	}

	//bicycle class has three methods
	public void applyBreake(int decrement){
		speed-=decrement;
	}
	
	public void speedUp(int increment) {
		speed+=increment;
			
	}
	
	public String toString() {
		return ("no of gare are : "+gare +" \n"+"speed of bicycle is : "+speed);
	}
}
