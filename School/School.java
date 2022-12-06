package com.xworkz.School;

public class School {

	public Student student;
	public int fees;
	
	public boolean admission( Student student) {
		boolean isFeePay=false;
		if(fees==10000) {
			this.student=student;
			student.displayInfo();
		}else {
			System.out.println("Fees not paid....Please pay fees");
		}
		return isFeePay;
	}
}
