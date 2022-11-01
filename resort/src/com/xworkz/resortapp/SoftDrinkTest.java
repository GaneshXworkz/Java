package com.xworkz.resortapp;

public class SoftDrinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SoftDrink sft=new SoftDrink("465687DRi","Fanta","150","Orange","1500ml");
		System.out.println(SoftDrink.madein);
		System.out.println(sft.id+" "+sft.name+" "+sft.price+" "+sft.flavor+" "+sft.quantity+" "+SoftDrink.madein);
		SoftDrink.toDrink();
		
		SoftDrink sft1=new SoftDrink("465687DRi","7up","89","nambu","1500ml");
		System.out.println(sft1.id+" "+sft1.name+" "+sft1.price+" "+sft1.flavor+" "+sft1.quantity);

		SoftDrink sft2=new SoftDrink("465687DRi","Miranda","90","Orange","1500ml");
		System.out.println(sft2.id+" "+sft2.name+" "+sft2.price+" "+sft2.flavor+" "+sft2.quantity);

		SoftDrink sft3=new SoftDrink("465687DRi","Slice","160","Orange","1500ml");
		System.out.println(sft3.id+" "+sft3.name+" "+sft3.price+" "+sft3.flavor+" "+sft3.quantity);

		SoftDrink sft4=new SoftDrink("465687DRi","Mazza","150","Orange","1500ml");
		System.out.println(sft4.id+" "+sft4.name+" "+sft4.price+" "+sft4.flavor+" "+sft4.quantity);


	}

}
