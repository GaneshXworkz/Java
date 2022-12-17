package com.Xworkz.JavaMemory;

public class ReverseSkip {
	
	public static void main(String[] args) {
		
         String h="ganaganagara";
		
		char ch[]=h.toCharArray();
	
		for(int i=ch.length-1;i>=0;i=i-3) {
			
			System.out.print(ch[i]);
			
		}
	}

}
