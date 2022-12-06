package com.xworkz.HierarchicalInhertence;

public class TemporaryEmp extends Employee{
	
	public double hike=0.35;
	
	public void dispalyTempEmp() {
		super.dispalySalary();
		System.out.println("Temporary Employee Salary : " +(salary+(salary*hike)));	
	}

	
	

}
