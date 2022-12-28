package com.xworkz.Collection.DTOContinesAndOverrideEqules;

import java.util.ArrayList;
import java.util.Collection;

public class GameDTOtest {

	public static void main(String[] args) {
		
		GamesDTO game1=new GamesDTO("Cricket","outdoor",11);
		GamesDTO game2=new GamesDTO("Football","outdoor",11);
		GamesDTO game3=new GamesDTO("Kabaddi","indoor",7);
		GamesDTO game4=new GamesDTO("vollyBall","indoor",7);
		GamesDTO game5=new GamesDTO("hockey","outdoor",11);

		
		
		
		
		Collection<GamesDTO> games=new ArrayList();
		games.add(game5);
		games.add(game4);
		games.add(game3);
		games.add(game2);
		games.add(game1);
		
		
		System.out.println(game5.getName().equals(game4.getName()));
		
		boolean equles=game4.equals(game5);
		
		boolean contain=games.contains(game5);
		System.out.println("Containes : "+contain);
		
		
	}
}
