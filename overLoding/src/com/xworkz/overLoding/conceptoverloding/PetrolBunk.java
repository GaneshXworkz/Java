package com.xworkz.overLoding.conceptoverloding;

public class PetrolBunk {
	
	public static int id;
	public String name;
	public String location;
	public static String workerName[]=new String[4];
	
	//defailt constructer                        
	public PetrolBunk() {
		this(id);
		//this(int id, String name,String location,String[] workerName);
		//System.out.println("one parameterized constructors calling");
		System.out.println("petrol Bunk object is created");
		
	}

	
	
	
	//paremeterized conatructor
	public PetrolBunk(int id, String name,String location,String[] workerName) {
		this();
		System.out.println();
		this.id=id;
		this.name=name;
		this.location=location;
		this.workerName=workerName;
	}
	public PetrolBunk(int id){
		System.out.println("one prametrerizid constroctor");
		this.id=id;
		
	}
//	public void provideFuels() {
//		
//	}
//	
//	public  void dispalayDetailes() {
//		System.out.println("dispaly() is invoked");
//		System.out.println(this.id+" "+this.name+" "+this.location);
//		System.out.println("list of workers"+ this.name);
//		for(int i=0;i<workerName.length;i++) {
//			System.out.println(workerName[i]);
//		}
	}
	
	


