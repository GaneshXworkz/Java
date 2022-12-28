package com.xworkz.Collection.DTOContinesAndOverrideEqules;

public class CalenderDTO {
	
	private String year;
	private String noOfHolidys;
	private String noOfDays;
	
	public CalenderDTO() {
		
	}

	public CalenderDTO(String year, String noOfHolidys, String noOfDays) {
		super();
		this.year = year;
		this.noOfHolidys = noOfHolidys;
		this.noOfDays = noOfDays;
	}
	
	@Override
	public boolean equals(Object reference)
	{
		System.out.println("Running equals from Airport");
		
		if(reference!=null)
		{
			if(reference instanceof CalenderDTO)
			{
				CalenderDTO ref=(CalenderDTO)reference;
				if(ref.year.equals(this.year))
				{
					System.out.println("name is Matching : "+ref.year);
					return true;
				}
			}
		}
		return false;
	}


	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getNoOfHolidys() {
		return noOfHolidys;
	}

	public void setNoOfHolidys(String noOfHolidys) {
		this.noOfHolidys = noOfHolidys;
	}

	public String getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(String noOfDays) {
		this.noOfDays = noOfDays;
	}

	@Override
	public String toString() {
		return "CalenderDTO [year=" + year + ", noOfHolidys=" + noOfHolidys + ", noOfDays=" + noOfDays + "]";
	}
	
	

}
