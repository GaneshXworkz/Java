package com.xworkz.Collection.Set;

import java.util.Objects;

public class CakeDTO {
	
	private String name;
	private String colour;
	private double prize;
	
	
	public CakeDTO() {
		super();
	}


	public CakeDTO(String name, String colour, double prize) {
		super();
		this.name = name;
		this.colour = colour;
		this.prize = prize;
	}


	@Override
	public String toString() {
		return "CakeDTO [name=" + name + ", colour=" + colour + ", prize=" + prize + "]";
	}


	@Override
	public int hashCode() {
		return 20;
	}


	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			if(obj instanceof CakeDTO) 
			{
				CakeDTO child=(CakeDTO)obj;
				if(child.name.equals(this.name)&&child.colour.equals(this.colour))
				{
					return true;
				}
		    }
		}
		return false;
	}
	
	
 String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public double getPrize() {
		return prize;
	}


	public void setPrize(double prize) {
		this.prize = prize;
	}
	
	
	
	

}
