package com.xworkz.Hospital;

public class Hospital {
	
	public Patient patient;
	
	public boolean isEmergency=true;
	public boolean isTreatmentRequired=true;
	
	public boolean admit(Patient patient)
	{
		boolean isAdmitted=false;
		
	   if(isTreatmentRequired==true)
		{
		    if(isEmergency ==true) 
		{
			this.patient=patient;
			patient.displyInfo();
			System.out.println("patient can be allowed in icu");
		}
		else 
		{
			this.patient=patient;
			patient.displyInfo();
			System.out.println("patient can be allowed in genral ward");
		}
		}	
		else {
			System.out.println("treatment is not required....");
		}
		return isAdmitted;
	}
}
