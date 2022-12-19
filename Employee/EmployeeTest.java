package com.Xworkz.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.setAge(30);
		emp.setBloodGroup("AB+");
		emp.setCompanyName("Infosys");
		emp.setId("INFO4678");
		emp.setName("Raman");
		emp.setPhoneNo(9874561235L);
		emp.setRole("Tester");
		
		System.out.println(emp);
		System.out.println(emp.hashCode());
		System.out.println(emp.equals(emp));
	}
}
