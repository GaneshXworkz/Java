package com.xworkz.Collection.FunctionInterfaceAndStream;

import java.util.Objects;

public class PlaceDTO {
	
	private String name;
	private String location;
	private String builtBy;
	private boolean destroyed;
	private double visitingFee;
	
	
	public PlaceDTO() {
		super();
		
			}


	public PlaceDTO(String name, String location, String builtBy, boolean destroyed, double visitingFee) {
		super();
		this.name = name;
		this.location = location;
		this.builtBy = builtBy;
		this.destroyed = destroyed;
		this.visitingFee = visitingFee;
	}


	@Override
	public int hashCode() {
		return 20;
	}

	public boolean equles(Object obj) {
		if(obj!=null)
		{
			if(obj instanceof  PlaceDTO) 
			{
				PlaceDTO ref=(PlaceDTO)obj;
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


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getBuiltBy() {
		return builtBy;
	}


	public void setBuiltBy(String builtBy) {
		this.builtBy = builtBy;
	}


	public boolean isDestroyed() {
		return destroyed;
	}


	public void setDestroyedBy(boolean destroyed) {
		this.destroyed = destroyed;
	}


	public double getVisitingFee() {
		return visitingFee;
	}


	public void setVisitingFee(double visitingFee) {
		this.visitingFee = visitingFee;
	}


	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", location=" + location + ", builtBy=" + builtBy + ", destroyed=" + destroyed
				+ ", visitingFee=" + visitingFee + "]";
	}
		
	
	
	
	
	

}
