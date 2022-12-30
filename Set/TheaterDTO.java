package com.xworkz.Collection.Set;

import java.util.Objects;

public class TheaterDTO {
	
	private String name;
	private String movie;
	private double prize;
	private String location;
	
	
	public TheaterDTO() {
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
			if(obj instanceof TheaterDTO) 
			{
				TheaterDTO child=(TheaterDTO)obj;
				if(child.name.equals(this.name)&&child.movie.equals(this.movie))
				{
					return true;
				}
		    }
		}
		return false;
	}


	public TheaterDTO(String name, String movie, double prize, String location) {
		super();
		this.name = name;
		this.movie = movie;
		this.prize = prize;
		this.location = location;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMovie() {
		return movie;
	}


	public void setMovie(String movie) {
		this.movie = movie;
	}


	public double getPrize() {
		return prize;
	}


	public void setPrize(double prize) {
		this.prize = prize;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "TheaterDTO [name=" + name + ", movie=" + movie + ", prize=" + prize + ", location=" + location + "]";
	}
	
	
	

}
