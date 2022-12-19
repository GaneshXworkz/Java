package com.Xworkz.Student;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Student {
	
	private String name;
	private String idCardNo;
	private String schoolName;
	private int age;
	private String standerd;
	private String bloodGrop;
	private long phoneNo;

	@Override
	public boolean equals(Object obj) {
		
		Student stu=(Student) obj;
		if(this.getName().equals(stu.getName())) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return  this.age;
	}

}
