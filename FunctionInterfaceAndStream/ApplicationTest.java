package com.xworkz.Collection.FunctionInterfaceAndStream;

import java.util.ArrayList;

import java.util.Collection;
import java.util.stream.Collectors;

public class ApplicationTest {
	
	public static void main(String[] args) {
		
	Collection<ApplicationDTO> appliction=new ArrayList<ApplicationDTO>();
	
	appliction.add(new ApplicationDTO("Google Pay",2.0,true,"Google",0));
	appliction.add(new ApplicationDTO("phone Pay",3.0,true,"Flipkart",0));
	appliction.add(new ApplicationDTO("Amezon Pay",6.0,true,"Amezon",0));
	appliction.add(new ApplicationDTO("Payem ",5.0,false,"One97 communication",0));
	appliction.add(new ApplicationDTO("whatsApp Pay",6.0,false,"WhatsApp INC",0));
	
	
	System.out.println("-----which is devloped by Google and Free-------");
	appliction
	.stream()
	.filter(ref->ref.getName().contains("Google")&& ref.isFree())
	.collect(Collectors.toSet())
	.forEach(ref->System.out.println(ref));
	
	System.out.println();
	System.out.println("-------------------------------------------------------");
	
	System.out.println("version is greater then 5 only collect names");
	appliction
	.stream()
	.filter(ref1-> ref1.getVersion()>5)
	.collect(Collectors.toSet())
	.forEach(ref1->System.out.println(ref1.getName()));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
