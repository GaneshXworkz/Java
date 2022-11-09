package com.xworkz.Festivalapp;

public class Festival {

	String name;
	String date;
	String food;
	String type;
	
	public String festivalName(String name) {
		this.name=this.name+name;
		System.out.println("festival name :"+name);
		return name;	
	}
	
	public String festivaldate(String date) {
		this.date=this.date+date;
		System.out.println("festival date :"+date);
		return date;	
	}
	
	public String festivalCelebration(String type) {
		this.type=this.type+type;
		System.out.println("festival Celebration :"+type);
		return type;	
	}
	public String festivalfood(String food) {
		this.food=this.food+food;
		System.out.println("festival food :"+food);
		return food;	
	}
	public void festivalIs() {
		System.out.println("Celebrate Culture");
		
	}
	
}
