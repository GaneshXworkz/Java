package com.xworkz.overLoding;

import com.xworkz.overLoding.conceptoverloding.PetrolBunk;

public class PetrolBunkTester {

	public static void main(String[] args) {
		
		 String[] workerName= {"VARUN","MAHENDRA","GANESH","SHIVU"};
		PetrolBunk bunk=new PetrolBunk(123,"Nandi Petrol Bunk","DAVANAGERE",workerName);
		
		System.out.println(bunk.id +" "+bunk.name+" "+bunk.location);
		
//		String workerName[]= {"Akash","Sumanth","Sneha","susham"};
//		
//		petrolBunk bunk2=new PetrolBunk(workerName);
//		System.out.println(bunk2.id+" "+bunk2.name);

	}

}
