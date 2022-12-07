package com.xworkz.ShowRoom;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Manager 
{
		
	private String name;
	private int age;
	private Gender gender;
	private String id;
	
	
	public void dispalyInfo() {
		System.out.println("Manager name : "+name);
		System.out.println("Manager age : "+age);
		System.out.println("Manager gender : "+gender);
		System.out.println("Manager address : "+id);

	}
		

}
