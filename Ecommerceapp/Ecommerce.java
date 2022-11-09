package com.xworkz.Ecommerceapp;

public class Ecommerce {
	
	 public String website;
	 public String address;
	 public	 String items[]= {"Shoes","Watches","mobilphones","ect..."};
	 
	
	 public String website(String website) {
		 this.website=this.website+website;
		 System.out.println("Welcome To :"+website);
		 return website;
	 }
	 
	 public void avilablity() {
		 System.out.println( "Items Avilabity ");
		 	for(int i=0;i<items.length;i++) {	
		 		System.out.println(items[i]);
		 		}
		 	}
	 
	 
	 
	 
	 }
	 
	 
	 
	 
				 
			 
		 
	 
	 
	 
	 
	 
	
		 
	 
	 
	 
	 

