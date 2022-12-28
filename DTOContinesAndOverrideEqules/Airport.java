package com.xworkz.Collection.DTOContinesAndOverrideEqules;

public class Airport {
	
	private String name;
	private String type;
	private int noPassangersTravel;
	
	public Airport() {
		
	}

	public Airport(String name, String type, int noPassangersTravel) {
		super();
		this.name = name;
		this.type = type;
		this.noPassangersTravel = noPassangersTravel;
	}
	
	
	
	@Override
	public boolean equals(Object reference)
	{
		System.out.println("Running equals from Airport");
		
		if(reference!=null)
		{
			if(reference instanceof Airport)
			{
				Airport ref=(Airport)reference;
				if(ref.name.equals(this.name))
				{
					System.out.println("name is Matching : "+ref.name);
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoPassangersTravel() {
		return noPassangersTravel;
	}

	public void setNoPassangersTravel(int noPassangersTravel) {
		this.noPassangersTravel = noPassangersTravel;
	}

	@Override
	public String toString() {
		return "Airport [name=" + name + ", type=" + type + ", noPassangersTravel=" + noPassangersTravel + "]";
	}
	
	

}
