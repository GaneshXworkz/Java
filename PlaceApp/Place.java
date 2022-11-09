package com.xworkz.PlaceApp;

public class Place {
	
	String placeName;
	String famaous;

	public String placeName(String placeName) {
		this.placeName+=placeName;
		System.out.println(" place Name   is :" +placeName);
		return placeName;
	}
	public String femaousFor(String famaous) {
		this.famaous+=famaous;
		System.out.println(" Famous for :" + famaous);
		return famaous;
	}
	
	
}
