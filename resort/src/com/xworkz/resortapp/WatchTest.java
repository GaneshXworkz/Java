package com.xworkz.resortapp;

public class WatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Watch wch=new Watch("45687WAT","blue","789","Fastrack","steel");
		System.out.println(wch.id+" "+wch.color+" "+wch.price+" "+wch.brandName+" "+wch.type);
		
		Watch wch1=new Watch("45687WAT","blue","800","TITAN","steel");
		System.out.println(wch1.id+" "+wch1.color+" "+wch1.price+" "+wch1.brandName+" "+wch1.type);
		
		Watch wch2=new Watch("45687WAT","blue","1200","TITAN raga","steel");
		System.out.println(wch2.id+" "+wch2.color+" "+wch2.price+" "+wch2.brandName+" "+wch2.type);
		
		Watch wch3=new Watch("45687WAT","blue","799","TItan JUxt","steel");
		System.out.println(wch3.id+" "+wch3.color+" "+wch3.price+" "+wch3.brandName+" "+wch3.type);
		
		Watch wch4=new Watch("45687WAT","blue","500","Sonata","steel");
		System.out.println(wch4.id+" "+wch4.color+" "+wch4.price+" "+wch4.brandName+" "+wch4.type);
		
	}

}
