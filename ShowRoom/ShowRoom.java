package com.xworkz.ShowRoom;

public class ShowRoom {
	
	 public Manager manager;
	 
	 public boolean isManager=true;
	 
	 
	 public boolean isManagerInsideShowRoom(Manager manager) {
		  boolean isManger=false;
		  
		  if(isManager==true)
		  {
			  System.out.println("Manager Detailes");
			  this.manager=manager;
			  manager.dispalyInfo();
			 
			  
		  }
		  else
			  
		  {
			  System.out.println("Manager is not Avalible");
		  }
		  
		 return isManger;
		 
	 }

}
