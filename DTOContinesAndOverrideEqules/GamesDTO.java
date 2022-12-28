package com.xworkz.Collection.DTOContinesAndOverrideEqules;

public class GamesDTO {

	private String name;
	private String type;
	private int noOfPlayers;
	
	public GamesDTO() {
		
	}

	public GamesDTO(String name, String type, int noOfPlayers) {
		super();
		this.name = name;
		this.type = type;
		this.noOfPlayers = noOfPlayers;
	}
	
	@Override
	public boolean equals(Object reference)
	{
		System.out.println("Running equals from GamesDTO");
		
		if(reference!=null)
		{
			if(reference instanceof GamesDTO)
			{
				GamesDTO ref=(GamesDTO)reference;
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

	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

	@Override
	public String toString() {
		return "GamesDTO [name=" + name + ", type=" + type + ", noOfPlayers=" + noOfPlayers + "]";
	}

	
	
	
}
