package com.xworkz.Collection.ForEachLoopAndIterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Watchs {

	public static void main(String[] args) {
		
		String watch1="TITAN";
		String watch2="FASTRACK";
		String watch3="SONATA";
		String watch4="TISSOT";
		String watch5="ROLEX";
		
		Collection<String> watch=new ArrayList<String>();
		watch.add(watch1);
		watch.add(watch2);
		watch.add(watch3);
		watch.add(watch4);
		watch.add(watch5);
		
		for(String ref:watch) 
		{
			System.out.println(ref);
		}

		System.out.println("=========Iterator========");
		
		Iterator<String> ite=watch.iterator();
		
		while(ite.hasNext())
		{
			
			String element=ite.next();
			System.out.println(element);
		}
		
	}
}
