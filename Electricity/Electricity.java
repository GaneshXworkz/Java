package com.xworkz.Electricity;

public class Electricity extends Bill{
	
	public int unit;
	public Electricity(int unit) {
		this.unit=unit;
		
	}

	@Override
	public boolean payBill(Recipt recipt) {
		if(unit>50) {
			return super.payBill(recipt);
		}else {
			System.out.println("I will add month bill with this");
		}
		return true;
	}
	
}
