package com.xworkz.Collection.Sanitizer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

public class SanitizerTest {
	
	public static void main(String[] args) {
		
		
		
		Sanitizer sanitize =new Sanitizer("101","LIFEBOY",170.00f,"RED");
		Sanitizer sanitize1=new Sanitizer("102","HIMAILAYA",185.00f,"BLUE");
		Sanitizer sanitize2=new Sanitizer("103","DETTOL",150.00f,"GREEN");
		Sanitizer sanitize3=new Sanitizer("104","SANTOOR",70.00f,"ORANGE");
		Sanitizer sanitize4=new Sanitizer("105","PATANJALI",65.00f,"WHITE");
		Sanitizer sanitize5=new Sanitizer("106","MEDIMIX",99.00f,"YELLOW");
		Sanitizer sanitize6=new Sanitizer("107","PURELL",110.00f,"PINK");
		Sanitizer sanitize7=new Sanitizer("108","SAVILON",50.00f,"SYKBLUE");
		Sanitizer sanitize8=new Sanitizer("109","GODREJ",85.00f,"BROWN");
		Sanitizer sanitize9=new Sanitizer("110","LYSOL",200.00f,null);
	 	
		                                                                     
		Collection<Sanitizer> sanitizers= new ArrayList<Sanitizer>();
		sanitizers.add(sanitize);
		sanitizers.add(sanitize1);
		sanitizers.add(sanitize2);
		sanitizers.add(sanitize3);
		sanitizers.add(sanitize4);
		sanitizers.add(sanitize5);
		sanitizers.add(sanitize6);
		sanitizers.add(sanitize7);
		sanitizers.add(sanitize8);
		sanitizers.add(sanitize9);
		
		
		Iterator<Sanitizer> it=sanitizers.iterator();
		
		
		 
		
		while(it.hasNext()) {
			
			
			Object element=it.next();
			System.out.println(element);
		}
		
		
		

		System.out.println();
		System.out.println("=============sanitizer prize greater then 70============");
		
		
		
		
		Iterator<Sanitizer> it1=sanitizers.iterator();

		while(it1.hasNext())
		{	
			Sanitizer element=it1.next();
			if(element.getPrize()>70) {
				System.out.println(element);
			}
		}
		System.out.println();
		System.out.println("==============Check Any Proporty is Null=================");
		
		Iterator<Sanitizer> ite2=sanitizers.iterator();
		
		while(ite2.hasNext()) 
		{
			
			Sanitizer element1 =ite2.next();
			if(element1.getColour()== null) {
				System.out.println(element1);
			}
			
		}
			
		System.out.println();
		System.out.println("==============Removing Some Colours=================");
		
        Iterator<Sanitizer> ite3=sanitizers.iterator();
		
		while(ite3.hasNext()) 
		{
			
			Sanitizer element1 =ite3.next();
					if(element1.getColour()=="RED" || element1.getColour()=="GREEN") {
				
				ite3.remove();
				
			}
				
		}
		System.out.println("Aftre removing colour from collection size of  : "+sanitizers.size());
	

		
		System.out.println();
		System.out.println("================Find min prize of Sanitizer==================");
	
		
	Iterator<Sanitizer> ite4=sanitizers.iterator();
		
		
	Sanitizer san = sanitizers.stream().min(Comparator.comparing(Sanitizer::getPrize)).get();
		
		System.out.println("Min Prize of Sanitizer : "+san);
		
		System.out.println();
		System.out.println("================Find max prize of Sanitizer==================");
		
		
		Iterator<Sanitizer> ite5=sanitizers.iterator();
			
			
		Sanitizer san1 = sanitizers.stream().max(Comparator.comparing(Sanitizer::getPrize)).get();
			
			System.out.println("Min Prize of Sanitizer : "+san1);
		
		
		}}		
		
		
		
		
		
		
		
		
				
				
			
			
		


	


