package com.xworkz.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Sweets {
	
	public static void main(String[] args) {
		
		String swt1="Cakes";
		String swt2="Biscuits";
		String swt3="cookies";
		String swt4="Pastries";
		String swt5="Frozen";
		String swt6="Candies";
		String swt7="Pudding";
		String swt8="Deep-fried";
		String swt9="Galatin";
		String swt10="Fruit";
		String swt11="Donuts";
		String swt12="Pies";
		String swt13="Gulab jamun";
		String swt14="Kheer";
		String swt15="Jalebi";
		String swt16="mango Kesari";
		String swt17="Kaju Barfi";
		String swt18="Rasgulla";
		
		
		Collection<String> collect =new ArrayList();
		collect.add(swt1);
		collect.add(swt2);
		collect.add(swt3);
		collect.add(swt4);
		collect.add(swt5);
		collect.add(swt6);
		collect.add(swt7);
		collect.add(swt8);
		collect.add(swt9);
		collect.add(swt10);
		collect.add(swt11);
		collect.add(swt12);
		collect.add(swt13);
		collect.add(swt14);
		collect.add(swt15);
		collect.add(swt16);
		collect.add(swt17);
		collect.add(swt18);
	
		System.out.println("Before Clearing");
		
		System.out.println("Size of Array : "+collect.size());
		
		System.out.println(collect);
		
		collect.clear();
		
		System.out.println();
		
		System.out.println("After clearing");
		
		System.out.println("Size of Array : "+collect.size());
		
		System.out.println(collect);
	
		

		
		
		
		
		
		
	}

}
