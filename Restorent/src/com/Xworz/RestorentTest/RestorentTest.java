package com.Xworz.RestorentTest;

import com.xworkz.Restorentapp.Restorent;

public class RestorentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DEFALT CONSTRUCTOR
		
		Restorent ref =new Restorent();
		ref.name="Ashoka";
		ref.gstNo="GST123546";
		ref.contectNo=8956123454L;
		ref.address="Rajajinagra";
		
		String veg[]=new String[3];
		veg[0]="roti";
		 veg[1]="dose";
		 veg[2]="kari";
		 
		 String nonVeg[]=new String[3];
		 nonVeg[0]="Chicken";
		 nonVeg[1]="mutton";
		 nonVeg[2]="Fish";
		
		 
		String coolDrinks[]=new String[3];
		coolDrinks[0]="Papsi";
		coolDrinks[1]="Slice";
		coolDrinks[2]="Mazza";
		
		String rooms[]=new String[2];
		rooms[0]="AC";
		rooms[1]="NoN-Ac";
		
		System.out.println(ref.name +"\n "+ref.gstNo+"\n "+ref.contectNo+"\n "+ref.address+"\n "+veg +"\n"+nonVeg+"\n"+coolDrinks+"\n"+rooms);
		
		
		
		//PARAMETERISED CONSTRUCTOR
		
		 /*String veg[]=new String[3];
		 veg[0]="roti";
		 veg[1]="dose";
		 veg[2]="kari";
		 
		 String nonVeg[]=new String[3];
		 nonVeg[0]="Chicken";
		 nonVeg[1]="mutton";
		 nonVeg[2]="Fish";
		
		 
		String coolDrinks[]=new String[3];
		coolDrinks[0]="Papsi";
		coolDrinks[1]="Slice";
		coolDrinks[2]="Mazza";
		
		String rooms[]=new String[2];
		rooms[0]="AC";
		rooms[1]="NoN-Ac";
		
		
		Restorent rest=new Restorent("ASHOK RESTORENT","GST4512368",98456875623L,"RAJAJINAGARA",veg,nonVeg,coolDrinks,rooms);
		rest.displyInfo();
		*/
	
	
	}

}
