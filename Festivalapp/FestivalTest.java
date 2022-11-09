package com.xworkz.Festivalapp;

public class FestivalTest {

	public static void main(String[] args) {
		
		Festival fest=new Festival();
		fest.festivalName("Deepavali");
		fest.festivaldate("28/10/2022");
		fest.festivalCelebration("Bursting crackers");
		fest.festivalfood("Holige and Sweets");
		fest.festivalIs();
		
		Dasaraa das=new Dasaraa();
		das.festivalName("Dasaraa");
		das.festivaldate("05/10/2022");
		das.festivalfood("Sweets and Fritters");
		das.festivalIs();
		das.festivalCelebration("Do pooja to all equipements");
	}
}
