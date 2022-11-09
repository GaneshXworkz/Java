package com.xworkz.searchenginapp;

public class SearchEngian {
	
	public String name;
	public String Information;
	
	
	
	public String toSearch (String Information) {
		this.Information=this.Information+Information;
		System.out.println(Information);
		return Information;
			
	}
	
	public String websiteName(String name) {
		this.name=this.name+name;
		System.out.println("website name :"+name);
		return name;
		
	}
	
	public void anotherWeb(String web,SearchEngian newWeb) {
		newWeb.toSearch(web);
		
	}
	
}
