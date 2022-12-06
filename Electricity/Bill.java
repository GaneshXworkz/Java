package com.xworkz.Electricity;

public class Bill {
	
	public Recipt recipt;
	
	public int billRs; 
	
	
	public boolean payBill(Recipt recipt) {
		boolean isPaid= false;
		if(billRs<=250) {
			this.recipt=recipt;
			recipt.displyInfo();
			
		}else {
			System.out.println("palse pay amount");
		}
		return isPaid;
	}
	

}
