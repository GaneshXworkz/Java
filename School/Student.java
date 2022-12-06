package com.xworkz.School;

public class Student {

	public String sName;
	public String oDB;
	public String standard;
	public String school;
	
	public Student(String sName, String oDB, String standard, String school) {
		super();
		this.sName = sName;
		this.oDB = oDB;
		this.standard = standard;
		this.school = school;
	}
	
	public void displayInfo() {
		System.out.println(" Student Nmae : "+sName);
		System.out.println(" Student DOF : "+oDB);
		System.out.println(" Student class : "+standard);
		System.out.println(" School Name : "+school);


	}

}
