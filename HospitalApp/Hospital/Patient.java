package com.xworkz.HospitalApp.Hospital;

public class Patient{
	
	//grouping data into single block as called as Encpsulation;
	
	private String name;
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	private int age;
	private Gender gender;
	private String address;
	
	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public Gender getGender() {
		return gender;
	}




	public void setGender(Gender gender) {
		this.gender = gender;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




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
