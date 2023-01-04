package com.xworkz.Collection.FunctionInterfaceAndStream;

import java.util.Objects;

public class CompanyCeoDTO {
	
	private String name;
	private String company;
	private int age;
	private String country;
	private String qualifiction;
	private boolean married;
	private DaughterDTO daughter;
	

	
	
	@Override
	public int hashCode() {
		return 30;
	}



	public boolean equles(Object obj) {
		if(obj!=null)
		{
			if(obj instanceof  CompanyCeoDTO) 
			{
				CompanyCeoDTO ref=(CompanyCeoDTO)obj;
				if(ref.name.equals(this.name))
				{
					return true;
				}
				
			}
			
			
		}
		
		return false;
	}



	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getCompany() {
		return company;
	}




	public void setCompany(String company) {
		this.company = company;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String getCountry() {
		return country;
	}




	public void setCountry(String country) {
		this.country = country;
	}




	public String getQualifiction() {
		return qualifiction;
	}




	public void setQualifiction(String qualifiction) {
		this.qualifiction = qualifiction;
	}




	public boolean getMarried() {
		return married;
	}




	public void setMarried(boolean married) {
		this.married = married;
	}




	public DaughterDTO isDaughter() {
		return daughter;
	}




	public void setDaughter(DaughterDTO daughter) {
		this.daughter = daughter;
	}




	public CompanyCeoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}




	public CompanyCeoDTO(String name, String company, int age, String country, String qualifiction, boolean married,
			DaughterDTO daughter) {
		super();
		this.name = name;
		this.company = company;
		this.age = age;
		this.country = country;
		this.qualifiction = qualifiction;
		this.married = married;
		this.daughter = daughter;
	}




	@Override
	public String toString() {
		return "CompanyCeoDTO [name=" + name + ", company=" + company + ", age=" + age + ", country=" + country
				+ ", qualifiction=" + qualifiction + ", married=" + married + ", daughter=" + daughter + "]";
	}
		
	

}
