package com.xworkz.Hospital;

public class Patient extends Hospital{
	
	public String name;
	public int age;
	public Gender gender;
	public String address;
	
	public Patient(String name,int age,Gender gender,String address) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.address=address;
		
	}
	

	public void displyInfo() {
		
		System.out.println("Patient Name :"+name);
		System.out.println("Patient age :"+age);
		System.out.println("Patient gender :"+gender);
		System.out.println("Patient address :"+address);

	}

}
