package com.xworkz.Car;

public class Car {
	
	public int gare;
	public int speed;
	
	public Car(int gare,int speed) {
		this.gare=gare;
		this.speed=speed;	
	}
	//methods1
	public void applyBreak(int decerement) {
		speed-=decerement;
	}
	
	//method 2
	public void speedUp(int increment) {
		speed+=increment;
		
	}
	
	public String toString() {
		return("No of gares : "+gare +"Speed of car : "+speed);
	}
	
	
}
