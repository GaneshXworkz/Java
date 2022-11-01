package com.xworkz.Interview;




public class Interview {
	
		
		
	//"toCharArray" is method of string which will help to convert string to charArray
	public static void reverese(String data) {
		
		char dataName[]=data.toCharArray();
		for(int i=dataName.length-1;i>=0;i--) {
			System.out.print(dataName[i]+" ");
		}
		
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		reverese("my name is ganesh");
		
				
	

	}

}
