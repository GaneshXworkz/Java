package com.xworkz.Collection.FunctionInterfaceAndStream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class CompanyTest {
	
	public static void main(String[] args) {
		
		Collection<CompanyCeoDTO> company=new ArrayList<CompanyCeoDTO>();
		company.add(new CompanyCeoDTO("Raman","IBM",38,"india","Mtech",true,
				(new DaughterDTO("Keerthi",9874561230L,22,false,true))));
		company.add(new CompanyCeoDTO("ravi","wipro",50,"france","BE",true,
				(new DaughterDTO("ranjita",9852361470L,22,false,true))));
		company.add(new CompanyCeoDTO("raju","infosys",59,"india","Mtech",true,
				(new DaughterDTO("anvita",9874561230L,21,true,true))));
		company.add(new CompanyCeoDTO("rohan","tech Mahendra",60,"india","BE",true,
				(new DaughterDTO("rani",9514561230L,20,false,true))));
		company.add(new CompanyCeoDTO("Tata","Tcs",60,"india","Mtech",true,
				(new DaughterDTO("Gouri",9632561230L,22,false,true))));

		
		System.out.println("CEO age is greater Then 50");
		company
		.stream()
		.filter(ele->ele.getAge()>50)
		.collect(Collectors.toList())
		.forEach(ele->System.out.println(ele));
		
		System.out.println("----------------------------------------------");
		
		System.out.println("Printing Company ceo's doughter's details");
		company
		.stream()
		.map(ele -> ele.isDaughter())
		.collect(Collectors.toSet())
		.forEach(name -> System.out.println(name));
		
		System.out.println("---------------------------------------------------");
		
		System.out.println("printing Age of CEO and Ceo Daughter age");
		company
		.stream()
		.forEach(ele->System.out.println("Age of CEO "+ ele.getAge() +" "+ "Doughter age "+ ele.isDaughter().getAge()));
		
		
	}

}
