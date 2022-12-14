package com.xworkz.Tostring;

public class EmployeeTest {

	public static void main(String[] args) {
		 
		Employee emp= new Employee();
		emp.setName("ravi");
		emp.setId(123456);
		emp.setAddress("ramanagara");
		System.out.println(emp);
		
		Employee emp1= new Employee();
		emp1.setName("ramu");
		emp1.setId(879465);
		emp1.setAddress("Davanagarae");
		System.out.println(emp1);

	}
}
