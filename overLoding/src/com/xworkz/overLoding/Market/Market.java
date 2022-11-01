package com.xworkz.overLoding.Market;

public class Market {
	
	int id;
	String shopName;
	String address;
	
	Market(int id){
		this.id=id;
		System.out.println("1");
		
	}
	
	Market(int id,String shopName){
		this(id);
		this.shopName=shopName;
		System.out.println("2");
	}
	
	
	Market(int id,String shopName,String address){
		//this();
		this(id,shopName);
		this.address=address;
		System.out.println("3");
	}
	
	void display() {
		
		System.out.println(id +" "+shopName +" "+ address);
	}
	
	
	
	

	public static void main(String[] args) {
		
		Market mar=new Market(123,"Super","Rajajinagra");
		mar.display();
		Market mar2=new Market(145,"swiggy","Rajajinagra");
		mar2.display();
		Market mar3=new Market(145,"swiggy");
		mar3.display();
		Market mar4=new Market(145);
		mar4.display();
		
		Market mar5=new Market(148,"jhl","ljhjlknl");
		mar5.display();
		


	}
	
	
	

}
