package com.practic.app;

public class Practice3 {
	
	String name;
	String id;
	String address;
	
	Practice3(){
		
	}
	public  Practice3(String name,String id,String address) {
			this.name=name;
			this.id=id;
			this.address=address;
	}
		
	
	

	public static void main(String[] args) {
		
		
	Practice3 ref=new Practice3();
		ref.name="gani";
		ref.id="1234";
		ref.address="Rajajinagra";
	
		System.out.println(ref.name+" "+ref.id+" "+ref.address);
		
	
	Practice3 pra=new Practice3("gani","1234","rajajinagara");


	}

}
