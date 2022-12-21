package com.xworkz.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Currencies {

	
	
	public static void main(String[] args) {
		
		String Curr1="Afghanistan Afghani";
		String Curr2="Albanian Lek";
		String Curr3="Algerian Dinar";
		String Curr4="US Dollar";
		String Curr5="Euro";
		String Curr6="Argentine Peso";
		String Curr7="Australian Dollar";
		String Curr8="Bangladeshi Taka";
		String Curr9="Belarussian Ruble";
		String Curr10="Belize Dollar";
		String Curr11="Canadian Dollar";
		String Curr12="Egyptian Pound";
		String Curr13="Swaziland Lilangeni";
		String Curr14="Danish Krone";
		String Curr15="France Euro ";
		String Curr16="Guyana Dollar";
		String Curr17="Hong Kong Dollar";
		String Curr18="Hungarian Forint";
		String Curr19="Iceland Krona";
		String Curr20="Indian Rupee	";
		String Curr21="Indonesian Rupiah";
		String Curr22="Iranian Rial";
		String Curr23="Israeli New Shekel";
		String Curr24="Japanese Yen";
		
		Collection<String> collect=new ArrayList();
		collect.add(Curr1);
		collect.add(Curr2);
		collect.add(Curr3);
		collect.add(Curr4);
		collect.add(Curr5);
		collect.add(Curr6);
		collect.add(Curr7);
		collect.add(Curr8);
		collect.add(Curr9);
		collect.add(Curr10);
		collect.add(Curr11);
		collect.add(Curr12);
		collect.add(Curr13);
		collect.add(Curr14);
		collect.add(Curr15);
		collect.add(Curr16);
		collect.add(Curr17);
		collect.add(Curr18);
		collect.add(Curr19);
		collect.add(Curr20);
		collect.add(Curr21);
		collect.add(Curr22);
		collect.add(Curr23);
		collect.add(Curr24);
		
		System.out.println("Before Clearing");
		
		System.out.println(collect);
		
		System.out.println(collect.size());
		
		collect.clear();
		
		System.out.println("After Clearing");
		
		System.out.println(collect);

		System.out.println(collect.size());

		
		


		
	}
}
