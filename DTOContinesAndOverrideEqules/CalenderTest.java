package com.xworkz.Collection.DTOContinesAndOverrideEqules;

import java.util.ArrayList;
import java.util.Collection;

public class CalenderTest {
	
	public static void main(String[] args) {
		
		CalenderDTO cal1=new CalenderDTO("2022","60","365");
		CalenderDTO cal2=new CalenderDTO("2023","65","365");
		CalenderDTO cal3=new CalenderDTO("2024","59","365");
		CalenderDTO cal4=new CalenderDTO("2025","54","365");
		CalenderDTO cal5=new CalenderDTO("2026","61","365");
		
		
		Collection<CalenderDTO> calender=new ArrayList();
		calender.add(cal5);
		calender.add(cal4);
		calender.add(cal3);
		calender.add(cal2);
		calender.add(cal1);
		
	boolean equals=cal1.equals(cal2);
		
		System.out.println("-------------------------------");

		System.out.println(cal1.getYear().equals(cal2.getYear()));
		
		System.out.println("-------------------------------");
		
		boolean contain=calender.contains(cal1);
		System.out.println("Containes : "+contain);

	}

}
