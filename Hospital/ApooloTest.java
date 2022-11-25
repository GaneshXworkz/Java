package com.xworkz.Hospital;

import java.util.Scanner;

public class ApooloTest {
	


	public static void main(String[] args) {
		
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the Size");
		int size =scanner.nextInt();
		
		AppoloHospital appolo=new AppoloHospital(size);
		Patient patient= new Patient( "prasad",25,Gender.male,"bellary");
		patient.name = "prasad";
		patient.age=25;
		patient.address="bellary";
		patient.gender=Gender.male;
		
		
		appolo.addPatient(patient);
		appolo.getAllPatients();
		
		
		scanner.close();
		
		
	}

}
