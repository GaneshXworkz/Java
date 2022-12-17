package com.Xworkz.JavaMemory;

public class UpperCaseFirstLetter {

	public static void main(String[] args) {
		
		String name= "java is highlevel programming language";
		
		String a[]=name.split(" ");
		String stor="";
		for(int i=0;i<a.length;i++) {
			
			

			char c=a[i].charAt(0);
			
			
			String b=String.valueOf(c).toUpperCase();
			
			
			String d=a[i].substring(1);
			
			
			 stor = stor+b+d+" ";
			// System.out.println(stor);
		}
		System.out.println(stor);
		
	//*********************************************************
		
		
		
		
	}
}
