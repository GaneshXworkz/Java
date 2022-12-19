package com.Xworkz.Fruite;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Fruite {
	
	private String name;
	private String address;
	private String id;
	private long phoneNo;
	private int rupees;
	private float travellingCharge;
	private double entryFee;
	private char grade;
	
	@Override
	public String toString() {
		  return "[name : "+this.name+" "+"company address : "+" "+this.address+" "+
		"companyid: "+this.id +" "+" phoneNo : "+this.phoneNo+" "+"Rupees : "
		+" "+this.rupees+" "+"travellingCharge   : "+this.travellingCharge+" "+"entryFee : "+
		this.entryFee+ " grade: "+" "+this.grade+"]";
		}
	
	@Override
	public int hashCode() {
		return this.rupees  ;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		//return true;
		//downCasting
		
		Fruite fruite= (Fruite) obj; 
		  if(this.getName().equals(fruite.getName())&& this.getAddress().equals(fruite.getAddress()))
		  {
		  return true;
		 
		 } return false;
		 
	}	

}
