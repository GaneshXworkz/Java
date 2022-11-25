package com.xworkz.EcommerceWeb;

public class EcommerceWeb {
	
	
	public String name;
	public String webSiteName;
	public String contctNo;
	public static String items[]= {"","","","","",""};
	
	public EcommerceWeb(String name,String webSiteName,String contctNo) {
		this.name=name;
		this.webSiteName=webSiteName;
		this.contctNo=contctNo;	
	}
	
	public static void addItems(String items) {
		items+=items;
		
	}
	
	public void getInfo() {
		System.out.println("Company Name : "+name+"website Name : "+webSiteName+"Contect No : "+contctNo);
		for(int i=0;i<items.length;i++) {
			System.out.println(i);
		}
	}
}
