package com.xworkz.School;

public class SchoolTest {
	
	public static void main(String[] args) {
		
		Student stu=new Student("ravi","21/05/2000","8th","RVWS");
		
		School school=new School();
		school.fees=10000;
		school.admission(stu);
		
		
		
	}

}
