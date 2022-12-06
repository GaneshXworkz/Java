package com.xworkz.HierarchicalInhertence;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee emp =new Employee();
		emp.dispalySalary();
		
		TemporaryEmp emp1= new TemporaryEmp();
		emp1.dispalyTempEmp();
		
		PermenantEmployee emp2=new PermenantEmployee();
		emp2.dispplyPerEmp();
	}

}
