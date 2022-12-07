package com.xworkz.ShowRoom;

public class TataShowRoom extends ShowRoom {

	public Manager[] managers;
	int index;
	public Manager[] newManager;
	
	public TataShowRoom(int size)
	{
		managers=new Manager[size];
	}
	
	public boolean addManager(Manager manager) 
	{
		System.out.println("inside add manager method");
		
		boolean isMangeradded=false;
		
		if(manager!=null) 
		{
			System.out.println("manager detiales are added");
			managers[index++]=manager;
			isMangeradded=true;
		}
		System.out.println("end manager method");
		return isMangeradded;
		
	}
	
	public void getAllMangers() 
	{
		System.out.println("List of mangers are");
		
		for(int i=0;i<managers.length;i++)
		{
			System.out.println("Manager Name : "+managers[i].getName());
			System.out.println("Manager Age : "+managers[i].getAge());
			System.out.println("Manager gender : "+managers[i].getGender());
			System.out.println("Manager id : "+managers[i].getId());
		}
	}

//**************************************************************************************************************
	public void getManagersDetailsByName(String managerName)
	{
		
		for(int i=0;i<managers.length;i++)
		{
		if(managers[i].getName().equals(managerName)) 
		{
			System.out.println("Manager Name : "+managers[i].getName());
			System.out.println("Manager Age : "+managers[i].getAge());
			System.out.println("Manager gender : "+managers[i].getGender());
			System.out.println("Manager id : "+managers[i].getId());
		}
		}
	}

//***********************************************************************************************************************	
	public void getManagerById(String managerId)
	{
		
		for(int i=0;i<managers.length;i++)
		{
		if(managers[i].getId().equals(managerId)) 
		{
			System.out.println("Manager Name : "+managers[i].getName());
			System.out.println("Manager Age : "+managers[i].getAge());
			System.out.println("Manager gender : "+managers[i].getGender());
			System.out.println("Manager id : "+managers[i].getId());
		}
		}
	}
	
//**************************************************************************************************************	
	public void getManagerByage(int managerAge)
	{
		
		for(int i=0;i<managers.length;i++)
		{
		if(managers[i].getAge()==(managerAge)) 
		{
			System.out.println("Manager Name : "+managers[i].getName());
			System.out.println("Manager Age : "+managers[i].getAge());
			System.out.println("Manager gender : "+managers[i].getGender());
			System.out.println("Manager id : "+managers[i].getId());
		}
		}
	}
	
//*****************************************************************************************************************
	
	public void getManagerByGender(String managerGender)
	{
		
		for(int i=0;i<managers.length;i++)
		{
		if(managers[i].getGender().equals(managerGender)) 
		{
			System.out.println("Manager Name : "+managers[i].getName());
			System.out.println("Manager Age : "+managers[i].getAge());
			System.out.println("Manager gender : "+managers[i].getGender());
			System.out.println("Manager id : "+managers[i].getId());
		}
		}
	}
	
//*************************************************************************************************************	
	public void getManagerNameById(String managerid)
	{
		
		for(int i=0;i<managers.length;i++)
		{
		if(managers[i].getId().equals(managerid)) 
		{
			System.out.println("Manager Name : "+managers[i].getName());
		
		}
		}
	}
	
//***************************************************************************************************************	
	public void getManagerIdbyNmae(String managername)
	{
		
		for(int i=0;i<managers.length;i++)
		{
		if(managers[i].getName().equals(managername)) 
		{
			System.out.println("Manager id : "+managers[i].getId());		
		}
		}
	}
	
//*********************************************************************************************************************
	//update
	
	public boolean updateManageraIdByName(String name, String newManagerId) {
		boolean isUpdated=false;
		
		System.out.println("inside update manger Id  by name");
		
		for(int i=0;i<managers.length;i++)
		{
			
			if(managers[i].getName().equals(name)) {
				
				managers[i].setId(newManagerId);
			}
			
		}
		return isUpdated;
	}
//**************************************************************************************************************************	
	//updated
	
	public boolean updateManagerNameById(String id ,String newManagerName) {
		boolean isUpdated=false;
		
		System.out.println("inside update manger  name by id");
		
		for(int i=0;i<managers.length;i++)
		{
			
			if(managers[i].getId().equals(id)) 
			{
				managers[i].setName(newManagerName);
			}
		}
		
		return isUpdated;
	}
	
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++	
	//Deleta
	
	public boolean deletedManagerByname(String name) {
		boolean isDeleated=false;
		
		
		for(int i=0,k=0;i<managers.length;i++) 
		{
			
			if(!managers[i].getName().equals(name))
			{
				newManager[k++]=managers[i];
				isDeleated=true;
			}
			
		}
		return isDeleated;
		
	}
	
	public void getNewManagerName()
	{
		for(int i=0;i<newManager.length;i++) 
		{
			System.out.println("Manager Name : "+managers[i].getName());
			System.out.println("Manager Age : "+managers[i].getAge());
			System.out.println("Manager gender : "+managers[i].getGender());
			System.out.println("Manager id : "+managers[i].getId());
		}
	}
	
	//****************************************************************************************************************************
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
