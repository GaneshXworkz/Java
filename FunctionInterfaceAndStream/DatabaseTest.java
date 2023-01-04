package com.xworkz.Collection.FunctionInterfaceAndStream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class DatabaseTest {
	
	public static void main(String[] args) {
		
		Collection<DatabaseVendorDTO> database=new ArrayList<DatabaseVendorDTO>();
		database.add(new DatabaseVendorDTO("Oracle databse","Oracal",Type.hierarchicalDatabaseSystem,"90TB",100));
		database.add(new DatabaseVendorDTO("IBM databse","ibm",Type.netwoekDatabaseSystem,"100TB",99));
		database.add(new DatabaseVendorDTO("Microsoft databse","Microsoft",Type.sql,"200TB",50));
		database.add(new DatabaseVendorDTO("IBM Db2 databse","ibm",Type.sql,"2600TB",80));
		database.add(new DatabaseVendorDTO("Filemarker databse","Filemarker",Type.ObjectOrientedDatabaseSystem,"500TB",700));

		
		System.out.println("Find all DataBase Vendor DTo convert upper case and print all DTO");
		database
		.stream()
		.map(ref->ref.getDevelopedBy().toUpperCase())
		.collect(Collectors.toList())
		.forEach(ref->System.out.print(ref +"\n"));
		
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println();
		System.out.println("Find all DataBase licenceCost is less then 100 and type sql DTO");

		database
	    .stream()
	    .filter(ele->ele.getLicenseCost()<100 && ele.getType().equals(Type.sql))
	    .collect(Collectors.toSet())
	    .forEach(ele->System.out.println(ele));

		System.out.println("--------------------------------------------------------------");

		System.out.println("Finding all Data base Type");
		database
	    .stream()
	    .map(ele1->ele1.getType())
	    .collect(Collectors.toSet())
	    .forEach(ele1->System.out.println(ele1));
		
	}

}
