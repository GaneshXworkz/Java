package com.xworkz.resortapp;

public class IronBoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IronBox ref= new IronBox("1234IRON","bajaj","metal","550");
		System.out.println(ref.id +" "+ref.name +" "+ref.type+" "+ref.prize);
		
		IronBox ref1= new IronBox("7854IRON","TATA","metal","680");
		System.out.println(ref1.id +" "+ref1.name +" "+ref1.type+" "+ref1.prize);
		
		IronBox ref2= new IronBox("5312IRON","Philips","metal","850");
		System.out.println(ref2.id +" "+ref2.name +" "+ref2.type +" "+ref2.prize);
		
		IronBox ref3= new IronBox("8945RON","LG","metal","650");
		System.out.println(ref3.id +" "+ref3.name +" "+ref3.type+" "+ref3.prize);
		
				
		
		

	}

}
