package com.xworkz.Abstract.Shop;

public abstract class NgoContract implements Shop {
	
	@Override
	public void doBussines() {
		System.out.println("Do Bussiness ");
	}
	
	int amount;
	public NgoContract(int amount) {
		
		this.amount=amount;
	}
	
}
