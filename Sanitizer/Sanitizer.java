package com.xworkz.Collection.Sanitizer;

public class Sanitizer {
	
	private String id;
	private String brand;
	private float prize;
	private String colour;
	
	
	 public Sanitizer() {
	 
	 }
	 
	
	public Sanitizer(String id, String brand, float prize, String colour) {
		super();
		this.id = id;
		this.brand = brand;
		this.prize = prize;
		this.colour = colour;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrize() {
		return prize;
	}

	public void setPrize(float prize) {
		this.prize = prize;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	

	@Override
	public String toString() {
		return "Sanitizer [id=" + id + ", brand=" + brand + ", prize=" + prize + ", colour=" + colour + "]";
	}
	
		
	
	
	

}
