package com.xworkz.examapp;

public class HallTicket {
	  private	String candidateName;
	    private String	subjectNames[];
	    private String usnNo;
	    private String universityName;
	    
	    
	    
	    public HallTicket(String candidateName, String subjectNames[] , String usnNo , String universityName) {
	       System.out.println("HallTicket object is created");
	       this.candidateName =  candidateName;
	       this.subjectNames = subjectNames;
	       this.usnNo = usnNo;
	       this.universityName = universityName;
	    }  
	    
	   public void  displayDetails() {
	          System.out.println("Candidate Name :"+ this.candidateName);
	          System.out.println("University Name :"+ this.universityName);
	          System.out.println("USN number is : "+this.usnNo);
	          System.out.println("List of subject Name is  :");
	          for(int i=0;i<subjectNames.length;i++) {
	        	   System.out.println(subjectNames[i]);
	          }
	    }

	}


