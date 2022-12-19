package com.Xworkz.Amezon;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Amezon {
	
	private String name;
	private String address;
	private int id;
	private long phoneNo;
	private int noOfProductes;
	private double minFee;
	private char comoanyGrade;
	
	@Override
	public String toString() {
	  return "[name : "+this.name+" "+"Address : "+" "+this.address+" "+
	"id: "+this.id +" "+"phone No : "+this.phoneNo+" "+"no Of Production : "
	+" "+this.noOfProductes+" "+"min Fee : "+this.minFee+" "+"CompanayGrade : "+
	this.comoanyGrade+"]";
	}
	
	@Override
	public int hashCode() {
		return this.id  ;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		//return true;
		//downCasting
		
		  Amezon amezon= (Amezon) obj; 
		  if(this.getName().equals(amezon.getName()))
		  {
		  return true;
		 
		 } return false;
		 
	}

}
