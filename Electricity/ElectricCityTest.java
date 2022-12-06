package com.xworkz.Electricity;

public class ElectricCityTest {
	 
	public static void main(String[] args) {
		
		Recipt rep =new Recipt ("1456WDSR","22/11/2022","Sasasiva",250);
		
		Bill bill= new Bill();
		bill.billRs=260;
		bill.payBill(rep);
		
		Electricity city=new Electricity(20);
		city.unit=51;
		city.payBill(rep);
		
	}
}
