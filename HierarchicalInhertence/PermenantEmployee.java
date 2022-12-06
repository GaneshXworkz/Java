package com.xworkz.HierarchicalInhertence;

public class PermenantEmployee extends Employee {
	
	public double hike =0.5;
	
	public void dispplyPerEmp() {
		super.dispalySalary();
		System.out.println("Permenant Employee Salaray : "+(salary+(salary*hike)));
	}

}
