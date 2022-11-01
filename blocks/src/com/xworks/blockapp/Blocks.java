package com.xworks.blockapp;



public class Blocks {
	
	public int id;
	public String name;
	
	public Blocks(int id ,String name){
		this.id=id;
		this.name=name;    
	}
	
    static {
	 System.out.println("1. sttaic block excuted");
	 }
	
	{
	System.out.println("2.intance block excuted");
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("3. main method is excuted");

		Blocks block= new Blocks(0,null);
		
		System.out.println(block.id+" "+block.name);
		
		
	}

	}
		
		
		

	


