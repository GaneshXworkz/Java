package com.xworkz.Hospital;

public class AppoloHospital extends Hospital {
	
	public  Patient[] patients;
	int index;
	

	public AppoloHospital(int size) 
	{
		patients=new Patient[size];
		
	}
	
	public boolean addPatient(Patient patient)
	{
		System.out.println("inside addPatient method");
		
		boolean isPatientAdded=false;
		
		if(patient!=null) 
		{
			System.out.println("patient detiales are added");
			patients[index++]=patient;
			isPatientAdded =true;
		}
		System.out.println("end addpatient method");
		return isPatientAdded;
	}
	
	public void getAllPatients() 
	{
		System.out.println("list of patientes are");
		for(int i=0;i<patients.length;i++)
		{
			System.out.println(patients[i].name+" "+patients[i].age+" "+patients[i].address+" "+patients[i].gender);
		}
	}
}
