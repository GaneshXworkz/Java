package com.xworkz.Bycicle;

public class MountianBike extends Bicycle {

	

	//the  mountain bike Subclass adds one more field
	public int  seatHeight;
	
	//the  mountainBike subclass has one constructor
	public MountianBike(int gare, int speed, int startHeight) {
		// invoking base-class(Bicycle) constructor
		super(gare, speed);
		seatHeight=startHeight;
		
	}
	
	public void setHeight(int newValue) {
		seatHeight=newValue;
		
	}
	
	//overriding toString()method 
	//of bicycle to print more info
	@Override
	public String toString() {
		return(super.toString()+"\nseat height is : " +seatHeight);
		
	}

}
