package com.xworkz.Collection.ForEachLoopAndIterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoesSize {
	
	public static void main(String[] args) {
		
		int size1=1;
		int size2=2;
		int size3=3;
		int size4=4;
		int size5=5;
		int size6=6;
		int size7=7;
		int size8=8;
		int size9=9;
		int size10=10;
		int size11=11;
		int size12=12;
		int size13=13;
		int size14=14;
		int size15=15;
		
		
		Collection<Integer> size=new ArrayList<Integer>();
		size.add(size1);
		size.add(size2);
		size.add(size3);
		size.add(size4);
		size.add(size5);
		size.add(size6);
		size.add(size7);
		size.add(size8);
		size.add(size9);
		size.add(size10);
		size.add(size11);
		size.add(size12);
		size.add(size13);
		size.add(size14);
		size.add(size15);
	
		
		for(int ref :size) {
			
			
			
			System.out.println(ref);
		}

		System.out.println("========Iterator=======");
		
		
		Iterator<Integer> tie=size.iterator();
		
		while(tie.hasNext()) 
		{
			int ref=tie.next();
			System.out.println(ref);
		}
		
		
		
	}

}
