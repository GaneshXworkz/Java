package com.xworkz.Abstract.HospitalApp;

public interface HospitalContract {
	
	public boolean patientAdded(Patient patient);
	public void getAllPatientDeatiles();
	public void getPatientDetailsByname(String name);
	public void getPatientDetailsByAge(int age);
	public void getPatientDetailsByAddress(String address);
	
	
	
}
