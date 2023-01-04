package com.xworkz.Collection.FunctionInterfaceAndStream;

import java.util.Objects;

public class DatabaseVendorDTO {
	
	private String name;
	private String developedBy;
	private Type type;
	private String size;
	private int licenseCost;
	
	
	@Override
	public String toString() {
		return "DatabaseVendorDTO [name=" + name + ", developedBy=" + developedBy + ", type=" + type + ", size=" + size
				+ ", licenseCost=" + licenseCost + "]";
	}


	public DatabaseVendorDTO(String name, String developedBy, Type type, String size, int licenseCost) {
		super();
		this.name = name;
		this.developedBy = developedBy;
		this.type = type;
		this.size = size;
		this.licenseCost = licenseCost;
	}


	public DatabaseVendorDTO() {
		super();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDevelopedBy() {
		return developedBy;
	}


	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}


	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public int getLicenseCost() {
		return licenseCost;
	}


	public void setLicenseCost(int licenseCost) {
		this.licenseCost = licenseCost;
	}


	@Override
	public int hashCode() {
		return 20;
	}



	public boolean equals(Object obj) {
		if(obj!=null)
		{
			if(obj instanceof  DatabaseVendorDTO) 
			{
				DatabaseVendorDTO ref=(DatabaseVendorDTO)obj;
				if(ref.name.equals(this.name))
				{
					return true;
				}
				
			}
			
			
		}
		
		return false;
	}


		
	}
