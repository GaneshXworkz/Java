package com.Xworkz.Finolex;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class FinolexWiresDto {
	
	private String name;
	private int id;
	private String modelNumber;
	private String asin;
	private String CountryOrigin;
	private String manufacturer;
	private String weight;
	private int price;
	
	
	@Override
	public String toString() {
		  return "[name : "+this.name+" "+"company modelNumber : "+" "+this.modelNumber+" "+
		"companyid: "+this.id +" "+" asin : "+this.asin+" "+"Country Origin : "
		+" "+this.CountryOrigin+" "+"manufacturer   : "+this.manufacturer+" "+"weight : "+
		this.weight+ "price fee: "+" "+this.price+"]";
		}
	
	@Override
	public int hashCode() {
		return this.price  ;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		//return true;
		//downCasting
		
		FinolexWiresDto fin= (FinolexWiresDto) obj; 
		  if(this.getName().equals(fin.getName())&& this.getModelNumber().equals(fin.getModelNumber()))
		  {
		  return true;
		 
		 } return false;
		 
	}
	
	

}
