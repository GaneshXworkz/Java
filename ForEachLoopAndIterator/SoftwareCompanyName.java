package com.xworkz.Collection.ForEachLoopAndIterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftwareCompanyName {

	public static void main(String[] args) {
		
		String comp1="Wipro";
		String comp2="Infosys";
		String comp3="Capgemini";
		String comp4="Tech Mahindra";
		String comp5="TCS";
		String comp6="Google India Private Ltd.";
		String comp7="SAP Labs India Private Ltd";
		String comp8="Intuit Technology Services";
		String comp9="Cisco Systems (India) Private Ltd";
		String comp10="Adobe Systems India Private Ltd.";
		String comp11="Accenture ";
		String comp12="Oracle";
		String comp13="IBM";
		String comp14="Cognizant";
		String comp15=" Mindtree";
		String comp16="Dell Technologies";
		String comp17="American Express India";
		String comp18="Ujjivan Financial Services Private Ltd";
		String comp19=" HCL";
		String comp20="Amazon";
	
		Collection<String> company=new ArrayList<String>();
		company.add(comp1);
		company.add(comp2);
		company.add(comp3);
		company.add(comp4);
		company.add(comp5);
		company.add(comp6);
		company.add(comp7);
		company.add(comp8);
		company.add(comp9);
		company.add(comp10);
		company.add(comp11);
		company.add(comp12);
		company.add(comp13);
		company.add(comp14);
		company.add(comp15);
		company.add(comp16);
		company.add(comp17);
		company.add(comp18);
		company.add(comp19);
		company.add(comp20);
		
		for(String ref:company) {
			System.out.println(ref);
		}
		
		System.out.println("======Iterator========");
		
		
		Iterator<String> ite=company.iterator();
		
		while(ite.hasNext()) 
		{
			String ref=ite.next();
			System.out.println(ref);
		}

	}
}
