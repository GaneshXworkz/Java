package com.xworkz.Collection.CompareToAndStream;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.print.Doc;

public class MovieTest {
	
	public static void main(String[] args) {
		
		
		Collection<MovieDTO> movies=new ArrayList<MovieDTO>();
		movies.add(new MovieDTO("Avathar",100,"2022/12/05","English",250));
		movies.add(new MovieDTO("Veda",50,"2022/11/05","Kannada",300));
		movies.add(new MovieDTO("Kranthi",200,"2023/1/26","Kannada",250));
		movies.add(new MovieDTO("Kanatahara",75,"2022/09/15","Kannada",200));
		movies.add(new MovieDTO("KGF3",200,"2023/08/12","Hindi",250));

		movies
		.stream()
		.sorted()
		.collect(Collectors.toSet())
		.forEach(ref->System.out.println(ref));
		
		
		System.out.println("-----------------------------------------------");
		
	
		
		
		
		
		
		
	}
	
	
	
	

}
