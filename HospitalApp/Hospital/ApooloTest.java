package com.xworkz.HospitalApp.Hospital;

import java.util.Scanner;

public class ApooloTest {
	


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Size");
		int size =sc.nextInt();
		
		AppoloHospital appoloHospital = new AppoloHospital(size);
		
		
		
		for(int i=0;i<size;i++) {
			
		Patient patient =new Patient(null, size, null, null);
		
		System.out.println("enter patient name");
		patient.setName(sc.next());
		
		System.out.println("enter patient age ");
		patient.setAge(sc.nextInt());
		
		System.out.println("enter patient gender ");	
		String gender=sc.next();
		patient.setGender(Gender.valueOf(gender));
		
		
		System.out.println("enter patient Address ");
		patient.setAddress(sc.next());
		
		
		appoloHospital.addPatient(patient);
		

		

		}
		
		appoloHospital.getAllPatients();

		
		/*
		 * System.out.println("Get Patient Detailes by name");
		 * appoloHospital.getPatientByName(sc.next());
		 * 
		 * 
		 * System.out.println("Get Patient Detailes by age");
		 * appoloHospital.getPatientbyAge(sc.nextInt());
		 * 
		 * 
		 * System.out.println("Get Patient Detailes by gender");
		 * appoloHospital.getGenderBygenderName(sc.next());
		 * 
		 * System.out.println("Get Patient Detailes by Address");
		 * appoloHospital.getPatientbyAddress(sc.next());
		 * 
		 * 
		 * System.out.println("Get Patient Gender by using Name");
		 * appoloHospital.getGenderBygenderName(sc.next());;
		 * 
		 * System.out.println("Get Patient Name by using Gender");
		 * appoloHospital.getGenderBygenderName(sc.next());
		 */
		
		/*
		 * System.out.println("Udate Patient Address using name");
		 * name=sc.next(); String newName=sc.next();
		 * appoloHospital.updatePatientAddressByName(name,newName);
		 * appoloHospital.getAllPatients();
		 */
		
		/*
		 * System.out.println("Udate Patient Age using name"); String name=sc.next();
		 * int newAge=sc.nextInt();
		 * 
		 * appoloHospital.updatePatientAgeByName(name, newAge);
		 * appoloHospital.getAllPatients();
		 */
		
		System.out.println("Deleted Patient  name");
		String name=sc.next();
		appoloHospital.deletePatientByName(name);
		appoloHospital.getAllNewPatients();
		
		
				
	sc.close();	
	}

}
