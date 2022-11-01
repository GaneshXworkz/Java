package com.xworkz.resortapp;

public class FootWearTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FootWear foot=new FootWear("78954FOt","Paragon",800,"red","casual");
		System.out.println(foot.id+" "+foot.brandName+" "+foot.prize+" "+foot.color+" "+foot.type);
		
		FootWear foot2=new FootWear("78954FOt","bata",1200,"red","casual");
		System.out.println(foot2.id+" "+foot2.brandName+" "+foot2.prize+" "+foot2.color+" "+foot2.type);
		
		FootWear foot3=new FootWear("78954FOt","spark",500,"red","casual");
		System.out.println(foot3.id+" "+foot3.brandName+" "+foot3.prize+" "+foot3.color+" "+foot3.type);
		
		FootWear foot4=new FootWear("78954FOt","walkaro",899,"red","casual");
		System.out.println(foot4.id+" "+foot4.brandName+" "+foot4.prize+" "+foot4.color+" "+foot4.type);
		
		FootWear foot5=new FootWear("78954FOt","Paragon",799,"red","casual");
		System.out.println(foot5.id+" "+foot5.brandName+" "+foot5.prize+" "+foot5.color+" "+foot5.type);

	}

}
