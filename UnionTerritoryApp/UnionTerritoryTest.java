package com.xworkz.UnionTerritoryApp;

public class UnionTerritoryTest {
	
	public static void main(String[] args) {
		
		UnionTerritory ter=new UnionTerritory();
		System.out.println("UnionTerritory Name :" + ter.territoryName("Delhi"));
		ter.pincode(578133);
		System.out.println( "Pin Code :"+ter.pincode);
		
		System.out.println("Good palace :"+ter.goodPlace("India Gate"));
		
		
		
		Leh leh= new Leh();
		leh.goodPlace("very good place for soldiers");
		leh.pincode(845654);
		
		
		
		
	}

}
