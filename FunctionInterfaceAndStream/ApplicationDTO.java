package com.xworkz.Collection.FunctionInterfaceAndStream;

public class ApplicationDTO {
	
	private String name;
	private double version;
	private boolean free;
	private String developedBy;
	private double prize;
	
	
	public ApplicationDTO() {
		super();
		
	}


	public ApplicationDTO(String name, double version, boolean free, String developedBy, double prize) {
		super();
		this.name = name;
		this.version = version;
		this.free = free;
		this.developedBy = developedBy;
		this.prize = prize;
	}


	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", version=" + version + ", free=" + free + ", developedBy="
				+ developedBy + ", prize=" + prize + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getVersion() {
		return version;
	}


	public void setVersion(double version) {
		this.version = version;
	}


	public boolean isFree() {
		return free;
	}


	public void setFree(boolean free) {
		this.free = free;
	}


	public String getDevelopedBy() {
		return developedBy;
	}


	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}


	public double getPrize() {
		return prize;
	}


	public void setPrize(double prize) {
		this.prize = prize;
	}


	@Override
	public int hashCode() {
		return 30;
	}

	public boolean equles(Object obj) {
		if(obj!=null)
		{
			if(obj instanceof  ApplicationDTO) 
			{
				ApplicationDTO ref=(ApplicationDTO)obj;
				if(ref.name.equals(this.name))
				{
					return true;
				}
				
			}
			
			
		}
		
		return false;
	}
	
	
	
	

}
