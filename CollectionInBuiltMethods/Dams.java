package com.xworkz.Collection.CollectionInBuiltMethods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Dams {
	
	
	public static void main(String[] args) {
		
		Collection<String> andhraPradesh=new ArrayList<String>();
			andhraPradesh.add("Srisailam ");
			andhraPradesh.add("Somasila Dam");
			andhraPradesh.add("Nagarjuna Sagar");
		
		
		Collection<String> telangana=new ArrayList<String>();
			telangana.add("Nagarjuna Sagar ");
			telangana.add("Nizam Sagar ");
			telangana.add("Sriram Sagar Project");
		
		Collection<String> tamilnadu=new ArrayList<String>();
			tamilnadu.add("Perunchani ");
			tamilnadu.add("Mettur ");
			tamilnadu.add("Bhavanisagar ");
		
		Collection<String> gujarat=new ArrayList<String>();
			gujarat.add("Dharoi ");
			gujarat.add("Dantiwada ");
			gujarat.add("Kadana ");
			gujarat.add("Sardar Sarovar");
		
		Collection<String> HimachalPradesh=new ArrayList<String>();
			HimachalPradesh.add("Bhakra ");
			HimachalPradesh.add("Chamera ");
			HimachalPradesh.add("Nathpa Jhakri ");
			HimachalPradesh.add("Pandoh ");
		
		Collection<String> JammuandKashmir=new ArrayList<String>();
			JammuandKashmir.add("Baglihar ");
			JammuandKashmir.add("Dumkhar ");
			JammuandKashmir.add("Uri ");
		
		Collection<String> Jharkhand=new ArrayList<String>();
			Jharkhand.add("Chandil ");
			Jharkhand.add("Maithon ");
			Jharkhand.add("Panchet ");

		Collection<String> Karnataka=new ArrayList<String>();
			Karnataka.add("Almatti ");
			Karnataka.add("Kadra ");
			Karnataka.add("Harangi ");
			Karnataka.add("Krishna Raja Sagara ");
			Karnataka.add("Basava Sagara");
			Karnataka.add("Kodasalli ");
			Karnataka.add("Tungabhadra ");
		
		Collection<String> Kerala=new ArrayList<String>();
			Kerala.add("Banasura Sagar ");
			Kerala.add("Idukki ");
			Kerala.add("Walayar ");
			Kerala.add("Neyyar ");
			Kerala.add("Mullaperiyar ");
			Kerala.add("Cheruthoni ");
		
		Collection<String> MadhyaPradesh=new ArrayList<String>();
			MadhyaPradesh.add("Bansagar ");
			MadhyaPradesh.add("Bargi ");
			MadhyaPradesh.add("Indirasagar ");
			MadhyaPradesh.add("Rajghat ");
			MadhyaPradesh.add("Gandhi Sagar ");
		
		Collection<String> Maharashtra=new ArrayList<String>();
			Maharashtra.add("Khadakwasla Dam");
			Maharashtra.add("Radhanagari Dam");
			Maharashtra.add("Bhandardara Dam");
			Maharashtra.add("Kolkewadi Dam");
			Maharashtra.add("Panshet Dam");
			Maharashtra.add("Jayakwadi Dam");
			Maharashtra.add("Mulshi Dam ");
		
		Collection<String> Odisha=new ArrayList<String>();
			Odisha.add("Hirakud ");
			Odisha.add("Indravati ");
			
	   Collection<String> Rajasthan=new ArrayList<String>();
	       Rajasthan.add("Bisalpur ");
	       
	       
	    Collection<String> UttarPradesh=new ArrayList<String>();
	       UttarPradesh.add("Rihand ");
	       UttarPradesh.add("Rajghat ");
	       
		Collection<String> Uttarakhand=new ArrayList<String>();
		  Uttarakhand.add("Tehri ");
		  Uttarakhand.add("AmmA");
		  
		  
		Collection<String> Dam=new ArrayList<String>(); 
			Dam.addAll(HimachalPradesh);
			Dam.addAll(Uttarakhand);
			Dam.addAll(UttarPradesh);
			Dam.addAll(Rajasthan);
			Dam.addAll(Odisha);
			Dam.addAll(Maharashtra);
			Dam.addAll(MadhyaPradesh);
			Dam.addAll(Kerala);
			Dam.addAll(Karnataka);
			Dam.addAll(Jharkhand);
			Dam.addAll(JammuandKashmir);
			Dam.addAll(gujarat);
			Dam.addAll(tamilnadu);
			Dam.addAll(telangana);
			Dam.addAll(andhraPradesh);
			
			
		Iterator<String> ref1=Dam.iterator();
		
		while(ref1.hasNext())
		{
			String element=ref1.next();
			System.out.println(element);
			
		}
		
		System.out.println();
		System.out.println("===============Dames starting with 't'==================");
		
		for(String ref2 :Dam) {
			
			if(ref2.startsWith("T") || ref2.startsWith("t")) {
				System.out.println(ref2);
			}
			
		}
			
		System.out.println();
		System.out.println("===============Dames Ending with 'ar'==================");
			

		for(String ref3 :Dam) {
			
			if(ref3.endsWith("ar") || ref3.endsWith("AR")) {
				System.out.println(ref3);
			}
			
		}	
			
			
		System.out.println();
		System.out.println("===============Charcter length ==15 ==================");	
			
	    Iterator<String> ref4=Dam.iterator();
	    
	    while(ref4.hasNext())
	    {
	    	 String element=ref4.next();
	    	 element.toCharArray();
	    	 if(element.length()==15) 
	    	 {
	    		
	    		 System.out.println(element);

	    	 }	 
	    }
       
		
			
        System.out.println();
		System.out.println("===============Charcter UpperCase ==================");
		
			
          for(String ref5 :Dam) {
			
				System.out.println(ref5.toUpperCase());
				
		}	
			

         System.out.println();
  		System.out.println("===============Charcter LoweCase ==================");
  		
  		 for(String ref6 :Dam) {
 			
				System.out.println(ref6.toLowerCase());
				
		}	
  		
  	    System.out.println();
   		System.out.println("===============Remove all if contanes 'p' ==================");
   		
   		
   		System.out.println("Before Size : "+Dam.size());
   		
   		Iterator<String> ref7=Dam.iterator();
   		
		System.out.println("=====REMOVED ELEMNTES WHICH CONTAINES 'P'=====");

   		while(ref7.hasNext()) {
   			
   			String element=ref7.next();

   			if(element.contains("p") || element.contains("P")) {
   				
   				System.out.println(element);
   				ref7.remove();
   				
   				
   			}
   			
   		}
   		
   		System.out.println("----------->After Remove Size : "+Dam.size());
   		
   		
   		
   		System.out.println();
   		System.out.println("=============== Plindrome ==================");
   		
   		
   		
   		Iterator<String> ref8=Dam.iterator();
   		
        while(ref8.hasNext()) 
        {
        	String element=ref8.next();
        	
        	StringBuilder element1= new StringBuilder();
        
        	element1.reverse();
        	
        	String pop =element1.toString();
        	
        	if(element.equals(pop)) 
        	{
        		System.out.println("Plindrome : " +pop);
        	}
        	else
        	{
        		System.out.println("not palindrome : "+pop );
        	}
        	
        }
   		
       
        
   		
   		
   		
   		
   		

   		
		
   		
   		
   		
  		 
	}

}
