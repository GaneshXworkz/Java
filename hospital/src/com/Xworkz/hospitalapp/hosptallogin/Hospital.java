package com.Xworkz.hospitalapp.hosptallogin;

public class Hospital {
	
	//Datatype variableNames[]=new Datatype[size];
	String patientNames[]=new String[6];
	int index ;
	
	public Hospital() {
		System.out.println("Hospital Constrcter is calling");
	}
	//******************************************************
	public void savePatientName(String patientName) {
		System.out.println("Hospital Object is created");
		if(patientNames !=null && patientNames.length>index) {
			patientNames[index++]=patientName;
			return ;
		}
		else {
			System.out.println("bed ella/...");
		}
	
	System.out.println("end of savePatientNames");
	return ;

}
	//***********************************************************
	public void getPatientName() {
		System.out.println("list of all the patient names");
		for(int i=0;i<patientNames.length;i++) {
			System.out.println(patientNames[i]+"");
		}
	}
	
	//***********************************************************
	//oldPatientName="Ganu";
	//newPatientName="Guna Sarkar";
	public boolean updatePatientNames(String oldPatientName,String newPatientName) {
	System.out.println("inside updatePatientNames");
	for(int i=0; i<patientNames.length;i++) {
		if(patientNames[i]==oldPatientName) {
			patientNames[i]=newPatientName;
			return true;
		}
		else {
			System.out.println("");
		}
	}
	return false;
}
}