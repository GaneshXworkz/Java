package com.xworkz.examapp;

public class Supplementry extends Exam {
	
	int noOfAttempts;
	public Supplementry(int noOfAttempts) {
		this.noOfAttempts=noOfAttempts;
		
		
	}
	
	@Override
	public boolean allow(HallTicket hallTicket) {
		System.out.println("Invoked allow method of SupplementaryExam");
		if(noOfAttempts>1) {
			return super.allow(hallTicket);
			
		}
		return false;
	}
	
	//@ -is a Annotation 

}
