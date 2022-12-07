package com.xworkz.ShowRoom;

import java.util.Scanner;

import com.xworkz.HospitalApp.Hospital.Gender;

public class TataShowRoomTester {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the Size");
		int size =sc.nextInt();
		
		TataShowRoom tata=new TataShowRoom(size);
		
		
		for(int i=0;i<size;i++) {
			
			Manager manage=new Manager();
			
			System.out.println("Enter Manager name");
			manage.setName(sc.next());
			
			System.out.println("Enter Manager age");
			manage.setAge(sc.nextInt());
			
			System.out.println("Enter Manager gender");
			String gender=sc.next();
			manage.setGender(Gender.valueOf(gender));
			
			
			System.out.println("Enter Manager Id");
			manage.setId(sc.next());
			
			tata.addManager(manage);
				
		}
		
		  tata.getAllMangers();
		  
		  
		  System.out.println("get manager detalis by  enter name");
		  tata.getManagersDetailsByName(sc.next());
		  
		  
		  System.out.println("get manager detalis by  enter age");
		  tata.getManagerByage(sc.nextInt());
		  
		  System.out.println("get manager detalis by  enter gender");
		  tata.getManagerByGender(sc.next());
		  
		  System.out.println("get manager detalis by enter id");
		  tata.getManagerById(sc.next());
		  
		  System.out.println("get manager nmae by entering id");
		  tata.getManagerNameById(sc.next());
		  
		  System.out.println("get manager id by entring name");
		  tata.getManagerIdbyNmae(sc.next());
		  
		  
		  System.out.println("update Managera Id By ENTER Name");
		  String name =sc.next();
		  String id=sc.next();
		  tata.updateManageraIdByName(name, id);
		  
		  
		  
		  System.out.println("update Managera name By ENTER id");
		  String Id=sc.next();
		  String Name=sc.next();
		  tata.updateManagerNameById(Id, Name);
		  
		  
		  System.out.println("deleted Manager By name");
		  String num=sc.next();
		  tata.deletedManagerByname(Name);
		  
		  tata.getNewManagerName();
		  
		 
		  
		  
		  
		  
		  
		  
		
		
	}

}
