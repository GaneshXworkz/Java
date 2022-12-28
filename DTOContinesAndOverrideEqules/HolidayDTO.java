package com.xworkz.Collection.DTOContinesAndOverrideEqules;

public class HolidayDTO {
	
	private String name;
	private String Date;
	private String noDays;
	
	HolidayDTO(){
		
	}

	public HolidayDTO(String name, String date, String noDays) {
		super();
		this.name = name;
		Date = date;
		this.noDays = noDays;
	}
	@Override
	public boolean equals(Object reference)
	{
		System.out.println("Running equals from HolidayDTO");
		
		if(reference!=null)
		{
			if(reference instanceof HolidayDTO)
			{
				HolidayDTO ref=(HolidayDTO)reference;
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

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getNoDays() {
		return noDays;
	}

	public void setNoDays(String noDays) {
		this.noDays = noDays;
	}

	@Override
	public String toString() {
		return "HolidayDTO [name=" + name + ", Date=" + Date + ", noDays=" + noDays + "]";
	}

}
