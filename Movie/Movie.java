package com.xworkz.Movie;

public class Movie {
	String moviname;
	String makingCost;
	
	public String moviname(String moviname) {
		this.moviname+=moviname;
		System.out.println("Writer name :"+moviname);
		return moviname;	
	}
	
	public String makingCost(String makingCost) {
		this.makingCost=this.makingCost+makingCost;
		System.out.println(" Petrol cost :"+makingCost);
		return makingCost;	
	}
}
