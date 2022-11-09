package com.xworkz.IndianCricketPlayer;

public class CricketPlayer {
	
	String playerName;
	String noOfCentury;
	
	public String playerName(String playerName) {
		this.playerName=this.playerName+playerName;
		System.out.println("Continent name :"+playerName);
		return playerName;	
	}
	
	public String noOfCentury(String noOfCentury) {
		this.noOfCentury=this.noOfCentury+noOfCentury;
		System.out.println(" No of countrys :"+noOfCentury);
		return noOfCentury;	
	}

}
