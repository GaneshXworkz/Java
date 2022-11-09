package com.xworkz.searchenginapp;

public class SearchEngianTest {
	
	public static void main(String[] args) {
		
		
		SearchEngian search=new SearchEngian();
		//search.websiteName("GOOGLE");
		
		System.out.println(search.toSearch("> InFromation"));
		System.out.println(search.toSearch("> get data"));
		
		Yahoo ya =new Yahoo();
		
		System.out.println("Website name :"+ya.websiteName("Yahoo"));		
		System.out.println(ya.toSearch(" * Inforamtion"));
		System.out.println(ya.toSearch(" * fetch Data"));
		 
		// System.out.println(newWeb.anotherWeb("Google","yahoo"));
		
		
	}

}
