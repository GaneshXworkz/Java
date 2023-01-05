package com.xworkz.Collection.CompareToAndStream;

import java.util.Objects;

public class WeaponDTO implements Comparable<WeaponDTO>{
	
	private String name;
	private String madeBY;
	private String madeOn;
	private double prize;
	private Type type;
	
	public WeaponDTO() {
		super();
		
	}

	public WeaponDTO(String name, String madeBY, String madeOn, double prize, Type type) {
		super();
		this.name = name;
		this.madeBY = madeBY;
		this.madeOn = madeOn;
		this.prize = prize;
		this.type = type;
	}

	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeBY=" + madeBY + ", madeOn=" + madeOn + ", prize=" + prize + ", type="
				+ type + "]";
	}

	@Override
	public int hashCode() {
		return 30;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null) 
		{
			if(obj instanceof WeaponDTO)
			{
				WeaponDTO ref=(WeaponDTO)obj;
				if(ref.name.equals(this.name)) 
				{
					return true;
				}
			}
		}
		return false;
	}
	
   public int compareTo(WeaponDTO o) {
	   
	   return o.name.compareTo(this.name);
	   
   }
   
	/*
	 * public int compareTo1(WeaponDTO b) {
	 * 
	 * return this.madeBY.compareTo(b.madeBY);
	 * 
	 * }
	 */
public String getName() {
	return name;
}

public String getMadeBY() {
	return madeBY;
}

public String getMadeOn() {
	return madeOn;
}

public double getPrize() {
	return prize;
}

public Type getType() {
	return type;
}

public void setName(String name) {
	this.name = name;
}

public void setMadeBY(String madeBY) {
	this.madeBY = madeBY;
}

public void setMadeOn(String madeOn) {
	this.madeOn = madeOn;
}

public void setPrize(double prize) {
	this.prize = prize;
}

public void setType(Type type) {
	this.type = type;
} 
	

}
