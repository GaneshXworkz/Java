package com.Xworkz.Student;

public class StudentTester {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.setAge(15);
		student.setBloodGrop("O+");
		student.setIdCardNo("STJ12305");
		student.setName("RAJU");
		student.setPhoneNo(8974561359L);
		student.setSchoolName("S.T.J.H.S");
		student.setStanderd("9th");
		
		System.out.println(student);
		System.out.println(student.hashCode());
		System.out.println(student.equals(student));
		
	}
}
