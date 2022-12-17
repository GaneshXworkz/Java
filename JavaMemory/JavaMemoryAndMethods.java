package com.Xworkz.JavaMemory;

public class JavaMemoryAndMethods {
	
	public static void main(String[] args) {
		
		/*
		 * String var="Dhanush";//stak
		 * 
		 * String var2="Radika";//stak
		 * 
		 * String var1 =new String("Dhanush");//heap
		 * 
		 * var2=var1;//Dhanush
		 * 
		 * System.out.println(var2);
		 * 
		 * //== is Compare memory address or ref System.out.println(var== var2);
		 * 
		 * // .equals compare value of object System.out.println(var1.equals(var2));
		 * 
		 * 
		 * 
		 * System.out.println("***************************************");
		 * 
		 * String str ="Baba";
		 * 
		 * String str1=new String("Baba"); //String str1= str; // --->//false //String
		 * str1="Baba";
		 * 
		 * System.out.println(str== str1);
		 *  //string objectes ore immutable 
		 *  //two types
		 * //litral object 
		 * //string object 
		 * //any methode and variables and objects ref
		 * is null 
		 * //String objects immutable //we can not modify or change
		 */
		
		String str ="Deavandra";
		
		String str1="Singh";
		
		str=str.concat(str1);
		
		int length=str1.length();
		
		System.out.println(length);
		
		
		char ch[]=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			count++;
		}
		
		System.out.println("length of String : "+count);
		
		
		String purfume[]= {"Fogg","Skinn","Magnet","Yardle"};
		System.out.println("list of perfumes");
		
		for(String perfume:purfume) {
			System.out.println(perfume);
			
		}
		
		//String buffer
		
		StringBuffer buffer=new StringBuffer("");
		
		buffer=buffer.app
		
		//Builder is more faster then buffer
		/*String str="barro magane ache nodtine";
		String str="Ganaganagra";
		output ="ragg";
		
*/		
		
	}

}
