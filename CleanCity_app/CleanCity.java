package com.xworkz.CleanCity_app;

public class CleanCity {
	
	public String cityname;
	public String ranking;
	
	
	public String cityname(String cityname) {
		this.cityname+=cityname;
		System.out.println(" Clean City Name is :" +cityname);
		return cityname;
	}
	public double ranking(double ranking) {
		this.ranking+=ranking;
		System.out.println(" City ranking is :" + ranking);
		return ranking;
	}

}
