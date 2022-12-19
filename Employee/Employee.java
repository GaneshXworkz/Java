package com.Xworkz.Employee;

import com.Xworkz.Student.Student;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Employee {

	private String name;
	private String id;
	private String CompanyName;
	private int age;
	private String role;
	private String bloodGroup;
	private long phoneNo;

	@Override
	public boolean equals(Object obj) {
		
		Employee emp=(Employee) obj;
		if(this.getName().equals(emp.getName())) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return  this.age;
	}
}
