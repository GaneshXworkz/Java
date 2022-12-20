package com.xworkz.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Coupoun {

	public static void main(String[] args) {
		
		String coupan1="CU20058YU";
		String coupan2="RT45698RE";
		String coupan3="YE45656OU";
		String coupan4="YU12364LN";
		String coupan5="EW12345LK";
		String coupan6="WQ78945IU";
		String coupan7="TW12345UT";
		String coupan8="TQ45678ON";
		String coupan9="TF12345SW";
		String coupan10="XZ12345KL";
		String coupan11="QW87956LI";
		String coupan12="YU79799KP";
		
		
		Collection<String> collect=new ArrayList();
		collect.add(coupan1);
		collect.add(coupan2);
		collect.add(coupan3);
		collect.add(coupan4);
		collect.add(coupan5);
		collect.add(coupan6);
		collect.add(coupan7);
		collect.add(coupan8);
		collect.add(coupan9);
		collect.add(coupan10);
		collect.add(coupan11);
		collect.add(coupan12);
		
		
	System.out.println(collect);
	
	System.out.println("Array size : "+collect.size());
	
	System.out.println("Before Array Length");
	
	collect.clear();
	
	System.out.println();
	
	System.out.println("After Array Length");

	
	System.out.println(collect);

	System.out.println("Array size : "+collect.size());


	


		

		

		
	}
}
