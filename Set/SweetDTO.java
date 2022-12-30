package com.xworkz.Collection.Set;

import java.util.Objects;

public class SweetDTO {

	private String name;
	private String colour;
	private double prize;
	private String shape;
	
	public SweetDTO() {
		
	}

	@Override
	public String toString() {
		return "SweetDTO [name=" + name + ", colour=" + colour + ", prize=" + prize + ", shape=" + shape + "]";
	}
	

	@Override
	public int hashCode() {
		return 35;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			if(obj instanceof SweetDTO) 
			{
				SweetDTO child=(SweetDTO)obj;
				if(child.name.equals(this.name)&&child.colour.equals(this.colour))
				{
					return true;
				}
		    }
		}
		return false;
	}
	

	public SweetDTO(String name, String colour, double prize, String shape) {
		super();
		this.name = name;
		this.colour = colour;
		this.prize = prize;
		this.shape = shape;
	}

	public String getName() {
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

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	
	
	
}
