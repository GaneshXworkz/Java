package com.xworkz.Abstract.HospitalApp;

public class Hospital implements  HospitalContract {
	
	int index;
	Patient[] patients;
	
	
	
	public Hospital (int size)
	{
		patients=new Patient[size];	
	}
	
	
	

	@Override
	public boolean patientAdded(Patient patient) {
		boolean isPatientAdded=false;
		//	System.out.println("not added");
			if(patient != null)
			{
				System.out.println("adding");
				
				patients[index++]=patient;
				isPatientAdded=true;
			}
		
		return false;
	}
	@Override
	public void getAllPatientDeatiles() {
		for(int j=0 ; j < patients.length ; j++)
		{
			
			System.out.println(this.patients[j].getName());
			System.out.println(this.patients[j].getAge());
			System.out.println(this.patients[j].getGender());
			System.out.println(this.patients[j].getAddress());
			System.out.println("================================");
			
		}
		
		
		
	}
	@Override
	public void getPatientDetailsByname(String name) {
		// TODO Auto-generated method stub
		System.out.println("inside get manager name");
		for (int i = 0; i < patients.length; i++) {
			
			if(patients[i].getName().equals(name))
			{
				System.out.println("managers found ");
				System.out.println(this.patients[i].getName());
				System.out.println(this.patients[i].getAge());
				System.out.println(this.patients[i].getGender());
				System.out.println(this.patients[i].getAddress());
			}
			
		}
	}
	@Override
	public void getPatientDetailsByAge(int age) {
		

		System.out.println("inside get manager age");
		for (int i = 0; i < patients.length; i++) {
			
			if(patients[i].getAge()==age)
			{
				System.out.println("managers found ");
				System.out.println(this.patients[i].getName());
				System.out.println(this.patients[i].getAge());
				System.out.println(this.patients[i].getGender());
				System.out.println(this.patients[i].getAddress());
			}}
		
		}
	@Override
	public void getPatientDetailsByAddress(String address) {
		
		System.out.println("inside get manager address");
		for (int i = 0; i < patients.length; i++) {
			
			if(patients[i].getAddress().equals(address))
			{
				System.out.println("patient found ");
				System.out.println(this.patients[i].getName());
				System.out.println(this.patients[i].getAge());
				System.out.println(this.patients[i].getGender());
				System.out.println(this.patients[i].getAddress());
			}
			
		}
		
		
	}











	
	
	

}
