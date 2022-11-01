package com.practic.app;

public class Practice1 {
	
	static String[] items= {"pizza","burger","maosranna",};
	static String i;
	 static String name;
	 
		 
		 
	 	
	public static void toGain() {
		System.out.println("knowladge");
		System.out.println("Success");
		System.out.println("hardwork");
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int sub(int c, int d) {
		return c-d;
	}
	
	public static void setName(String nam) {
		name=nam;
	}
	public static String getName() {
		return name;
	}
	
	
	
	// company name:-matchmove

	
	
	
	public static void main(String[] args) {
		Practice1.toGain();
		System.out.println(add(4,6));
		System.out.println(add(41,52));
		System.out.println(sub(45,56));
		
		Practice1.setName("gani");
		
		System.out.println(getName());

		
	}

}
