package com.Xworkz.bike;

import com.Xworkz.Beachapp.Beach;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Bike {
	private String name;
	private String companyAddress;
	private String companyid;
	private long phoneNo;
	private int rupees;
	private float expensiveCharge;
	private double entryFee;
	private char Companygrade;
	
	@Override
	public String toString() {
		  return "[name : "+this.name+" "+"companyAddress : "+" "+this.companyAddress+" "+
		"companyid: "+this.companyid +" "+"phone No : "+this.phoneNo+" "+"rupees : "
		+" "+this.rupees+" "+"expensiveCharge   : "+this.expensiveCharge+" "+"CompanayGrade : "+
		this.Companygrade+ "Entry fee: "+" "+this.entryFee+"]";
		}
	
	@Override
	public int hashCode() {
		return this.rupees  ;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		//return true;
		//downCasting
		
		Bike bike= (Bike) obj; 
		  if(this.getName().equals(bike.getName())&& this.getCompanyAddress().equals(bike.getCompanyAddress()))
		  {
		  return true;
		 
		 } return false;
		 
	}


	
}
