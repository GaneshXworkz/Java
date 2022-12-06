package com.xworkz.School;

public class SvsSchool extends School {
	
	public int fees;
	

	public SvsSchool(int fees) {

		this.fees = fees;
	}


	@Override
	public boolean admission( Student student) {
		if(fees==20000) {
			return super.admission(student);
			
		}else {
			System.out.println("please pay the fees");
		}
		return true;
		
	}
	
	
}
