package com.xworkz.Collection.DTOContinesAndOverrideEqules;

import java.util.ArrayList;
import java.util.Collection;

public class HolidayTEST {
	
	public static void main(String[] args) {
		
		HolidayDTO holidya1=new HolidayDTO("Deepavali","sep-26","4days");
		HolidayDTO holidya2=new HolidayDTO("Dassara","sep-5","9days");
		HolidayDTO holidya3=new HolidayDTO("Holi","mar-26","1day");
		HolidayDTO holidya4=new HolidayDTO("Ganesh Chaturti","sep-26","1day");
		HolidayDTO holidya5=new HolidayDTO("Independence Day","aug-15","1day");
		
		Collection<HolidayDTO> holiday=new ArrayList();
		holiday.add(holidya5);
		holiday.add(holidya4);
		holiday.add(holidya3);
		holiday.add(holidya2);
		holiday.add(holidya1);
		
	boolean equals=holidya1.equals(holidya1);
		
		System.out.println("-------------------------------");

		System.out.println(holidya1.getName().equals(holidya1.getName()));
		
		System.out.println("-------------------------------");
		
		boolean contain=holiday.contains(holidya1);
		System.out.println("Containes : "+contain);

	}

}
