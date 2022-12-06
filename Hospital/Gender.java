package com.xworkz.Hospital;

public enum Gender {
	
	male,female,transgender,others;
	
	class GFG {
		  
	    // Main driver method
	    public static void main(String[] args) {
	  
	        // Printing all the values
	        System.out.println(Gender.male.name());
	        System.out.println(Gender.female.name());
	        System.out.println(Gender.transgender.name());
	        System.out.println(Gender.others.name());
	    }
	}
}
