package com.xworkz.EcommerceWeb;

public class Flipkart extends EcommerceWeb {
	
	public int minPrice;
	public static String items[]= {"","","","","",""};


	public Flipkart(String name, String webSiteName, String contctNo, int minPrice) {
		super(name, webSiteName, contctNo);
		this.minPrice=minPrice;
		// TODO Auto-generated constructor stub
	}
	

	public static void addItems(String item) {
		items[]+=item;
		
	}
	
	@Override
	public void getInfo() {
		System.out.println("Company Name : "+name+"website Name : "+webSiteName+"Contect No : "+contctNo +"minPrice : "+minPrice);
		for(int i=0;i<items.length;i++) {
			System.out.println(i);
		}
	}
	
	

}
