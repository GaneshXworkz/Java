package com.xworkz.EcommerceWeb;

public class EcommerceTest {
	
	public static void main(String[] args) {
		
		Flipkart flip=new Flipkart("Flipkart", "www.flipkart.com", "896466323", 200);
		
		
		Flipkart.addItems("Root");
		Flipkart.addItems("powder");
		flip.getInfo();
		
		
		
	}

}
