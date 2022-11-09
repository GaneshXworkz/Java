package com.xworkz.DialogueWriter;

public class Dialoguewriter {

	String Name;
	String Writer;
	
	public String WriterName(String Name) {
		this.Name=this.Name+Name;
		System.out.println("Writer name :"+Name);
		return Name;	
	}
	
	public String Goodin(String Writer) {
		this.Writer=this.Writer+Writer;
		System.out.println(" Petrol cost :"+Writer);
		return Writer;	
	}
	
	
}
