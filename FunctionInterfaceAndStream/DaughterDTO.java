package com.xworkz.Collection.FunctionInterfaceAndStream;

public class DaughterDTO {
	
	private String name;
	private long mobilNo;
	private int age;
	private boolean commited;
	private boolean alive;
	
	
	public DaughterDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DaughterDTO(String name, long mobilNo, int age, boolean commited, boolean alive) {
		super();
		this.name = name;
		this.mobilNo = mobilNo;
		this.age = age;
		this.commited = commited;
		this.alive = alive;
	}


	@Override
	public String toString() {
		return "DaughterDTO [name=" + name + ", mobilNo=" + mobilNo + ", age=" + age + ", commited=" + commited
				+ ", alive=" + alive + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getMobilNo() {
		return mobilNo;
	}


	public void setMobilNo(long mobilNo) {
		this.mobilNo = mobilNo;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public boolean isCommited() {
		return commited;
	}


	public void setCommited(boolean commited) {
		this.commited = commited;
	}


	public boolean isAlive() {
		return alive;
	}


	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	@Override
	public int hashCode() {
		return 30;
	}



	public boolean equles(Object obj) {
		if(obj!=null)
		{
			if(obj instanceof  DaughterDTO) 
			{
				DaughterDTO ref=(DaughterDTO)obj;
				if(ref.name.equals(this.name))
				{
					return true;
				}
				
			}
			
			
		}
		
		return false;
	}

}
