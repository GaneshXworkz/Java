package com.Xworkz.Beachapp;

import com.Xworkz.Amezon.Amezon;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Beach {
	
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
	  return "[name : "+this.name+" "+"Address : "+" "+this.address+" "+
	"id: "+this.id +" "+"phone No : "+this.phoneNo+" "+"rupees : "
	+" "+this.rupees+" "+"travelling Charge  : "+this.travellingCharge+" "+"CompanayGrade : "+
	this.grade+ "Entry fee: "+" "+this.entryFee+"]";
	}
	
	@Override
	public int hashCode() {
		return this.rupees  ;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		//return true;
		//downCasting
		
		Beach beach= (Beach) obj; 
		  if(this.getName().equals(beach.getName())&& this.getAddress().equals(beach.getAddress()))
		  {
		  return true;
		 
		 } return false;
		 
	}
	
	
}
