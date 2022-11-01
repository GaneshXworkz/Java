package com.xworkz.app;

public class MadicalShop {
	
	public String gstno;
	public String name;
	public String address;
	public long staffcontectNo[];
	public String staffnames[];
	public String cosmatics[];
	public String billingMethod[];
	
	
	public MadicalShop(String gstno,String name,String address,long staffcontectNo[],String staffnames[],
			String cosmatics[],String billingMethod[]) {
		this.gstno=gstno;
		this.name=name;
		this.address=address;
		this.staffcontectNo=staffcontectNo;
		this.staffnames=staffnames;
		this.cosmatics=cosmatics;
		this.billingMethod=billingMethod;
			
	}
	
	public void displayInfo() {
		 System.out.println("Medical Shop name is"+name);
		 System.out.println("=======================");
        System.out.println("Medical Shop gst no is "+ gstno);
        System.out.println("=======================");
        System.out.println("Medical Shop address no is "+ address);
        System.out.println("=======================");
        System.out.println("Medical Staff Info");
        for (int i = 0; i < staffnames.length; i++) {
			  System.out.println(staffnames[i]);
        
	}
        System.out.println("Medical cosmatics info");
		 System.out.println("======================="); 
		 for(int i=0;i<cosmatics.length;i++) {
		        System.out.println(cosmatics[i]);
	 
		 }
		 
		 System.out.println("Medical staff info");
		 System.out.println("======================="); 
		 for(int i=0;i<staffnames.length;i++) {
		        System.out.println(staffnames[i]);
	 
		 }
		 
		 System.out.println("Medical bill info");
		 System.out.println("======================="); 
		 for(int i=0;i<billingMethod.length;i++) {
		        System.out.println(billingMethod[i]);
	 
		 }
		 
		 System.out.println("Medical contect info");
		 System.out.println("======================="); 
		 for(int i=0;i<staffcontectNo.length;i++) {
		        System.out.println(staffcontectNo[i]);
	 
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 }
	
	

}
