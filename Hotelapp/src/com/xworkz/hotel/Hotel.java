package com.xworkz.hotel;

public class Hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		public String gstNo;
		public String name;
		public String address;
		public long ContectNo[];
		public String noOfWorkers[];
		public String food[];
		
		
		
		public Hotel(String gstNo,String name,String address,long ContectNo[], String noOfWorkers[],String food[]) {
			
			this.gstNo=gstNo;
			this.name=name;
			this.address=address;
			this.ContectNo=ContectNo;
			this.noOfWorkers=noOfWorkers;
			this.food=food;
			
		}
		
		public void displayInfo(){
			System.out.println("IceCre parler information");
			System.out.println("******************************");
			System.out.println("GST NO"+" "+gstNo);
			System.out.println("NAME"+" "+name);
			System.out.println("ADDRESS"+" "+address);
			System.out.println("ContectNo");
			for(int i=0;i<ContectNo.length;i++) {
				System.out.println(ContectNo[i]);	
			}
			System.out.println("NO OF WORKERS");
			for(int i=0;i<noOfWorkers.length;i++) {
				System.out.println(noOfWorkers[i]);	
			}
			
			System.out.println("NO OF FLAVORES");
			for(int i=0;i<food.length;i++) {
				System.out.println(food[i]);	
			}
			
		
		

	}

	}
	
