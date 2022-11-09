package com.xworkz.Enginneringapp;

public class Engineering {
	
	public String branch;
	public String noOfSubject;
	public String collageName;
	
	
	public String branchName(String branch) {
		this.branch=this.branch +branch;
		System.out.println(" branch name :"+branch);
		return branch;
		
	}
	public String subjects(String noOfSubject ) {
		this.noOfSubject=this.noOfSubject +noOfSubject;
		System.out.println(" No Of Subjects  :"+noOfSubject);
		return noOfSubject;
		
	}
	
	public String instituteName(String collageName ) {
		this.collageName=this.collageName +collageName;
		System.out.println("Institute Name :"+collageName);
		return collageName;
		
	}
	
	public void Engineeringfor() {
		System.out.println("Enagineering is Degree");
		
	}
	
}
