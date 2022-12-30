package com.xworkz.Collection.Set;

import java.util.Objects;

public class PumaDTO {
	
	private String name;
	private String colour;
	private int size;
	
	
	public PumaDTO() {
		super();
	}

	

	@Override
	public int hashCode() {
		return 20;
	}



	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			if(obj instanceof PumaDTO) 
			{
				PumaDTO child=(PumaDTO)obj;
				if(child.name.equals(this.name)&&child.colour.equals(this.colour))
				{
					return true;
				}
		    }
		}
		return false;
	}

	


	public PumaDTO(String name, String colour, int size) {
		super();
		this.name = name;
		this.colour = colour;
		this.size = size;
	}


	@Override
	public String toString() {
		return "PumaDTO [name=" + name + ", colour=" + colour + ", size=" + size + "]";
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


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}
	
	
	

}
