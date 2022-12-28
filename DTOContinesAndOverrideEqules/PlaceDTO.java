package com.xworkz.Collection.DTOContinesAndOverrideEqules;

public class PlaceDTO {

	private String name;
	private String type;
	private String noOfTouristVist;
	
	public PlaceDTO() {
		
	}

	public PlaceDTO(String name, String type, String noOfTouristVist) {
		super();
		this.name = name;
		this.type = type;
		this.noOfTouristVist = noOfTouristVist;
	}
	
	
	@Override
	public boolean equals(Object reference)
	{
		System.out.println("Running equals from PlaceDTO");
		
		if(reference!=null)
		{
			if(reference instanceof PlaceDTO)
			{
				PlaceDTO ref=(PlaceDTO)reference;
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

	public String getNoOfTouristVist() {
		return noOfTouristVist;
	}

	public void setNoOfTouristVist(String noOfTouristVist) {
		this.noOfTouristVist = noOfTouristVist;
	}
	
	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", type=" + type + ", noOfTouristVist=" + noOfTouristVist + "]";
	}
	
}
