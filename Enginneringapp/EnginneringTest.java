package com.xworkz.Enginneringapp;

public class EnginneringTest {
	
	public static void main(String[] args) {
		
		Engineering eng= new Engineering();
		
		eng.branchName("Civil Enginnering");
		eng.instituteName("Govt Enginnering college");
		eng.Engineeringfor();
		eng.subjects("35");	
		
		ElectricalEngineering EC =new ElectricalEngineering();
		EC.branchName("E&c");
		EC.Engineeringfor();
		EC.subjects("35");
		
		MechnicalEngineering mech =new MechnicalEngineering();
		mech.branchName("Mechnical Enginnering");
		mech.instituteName("Governamet Enginnering College Chamarajanagra");
		mech.Engineeringfor();
		
	}

}

