package com.Xworkz.Vegetables;

import com.Xworkz.Fruite.Fruite;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Vegetables {
	
	private String vegname;
	private String companyAddress;
	private String companyid;
	private long phoneNo;
	private int rupees;
	private float vegCharge;
	private char veggrade;
	
	@Override
	public String toString() {
		  return "[veg name : "+this.vegname+" "+"company address : "+" "+this.companyAddress+" "+
		"companyid: "+this.companyid +" "+" phoneNo : "+this.phoneNo+" "+"Rupees : "
		+" "+this.rupees+" "+"veg Charge   : "+this.vegCharge+" "+"veg grade : "+
		this.veggrade+ "]";
		}
	
	@Override
	public int hashCode() {
		return this.rupees  ;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		//return true;
		//downCasting
		
		Vegetables veg= (Vegetables) obj; 
		  if(this.getVegname().equals(veg.getVegname())&& this.getCompanyAddress().equals(veg.getCompanyAddress()))
		  {
		  return true;
		 
		 } return false;
		 
	}	

	

}
