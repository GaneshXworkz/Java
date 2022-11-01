package com.practic.app;

public class practice4 {
	
	
	
		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		
		//REVERSE STRING
		
	/*	      	 String name="Hellow world";
				char rev[]=name.toCharArray();
				for(int i=rev.length-1;i>=0;i--) {
					System.out.print(rev[i]);
				}
	
		
		//**************************************************/
		//PALINDROME
		
	/*           	 String pali="Ganesh";
					String a="";
		
				char c[]=pali.toCharArray();
				for(int i=c.length-1;i>=0;i--) {
		  		a=a+(c[i]);	
					}
					System.out.println(pali);
					System.out.println(a);
			
		
				if(pali.toUpperCase().equals(a.toUpperCase())){
				System.out.println("palindrom");
				}else {
				System.out.println("not palindrom");
				}
	
		
		//**********************************************/
		
		
		//count the number of digits in the given number
		
		
	/*			String a ="12345";

				System.out.println(a.length());
	
		
		
		//*****************************************************/
		
		//check given number is prime or not
		
		int num=15; 
		int count=0;
		
		for(int i=1;i<=num;i++){
			if(num%i==0) {
				count+=1;
			}
		}
				if(count==2){
			System.out.println(" prime number  :" +" "+num);
		}else{
			System.out.println(" not prime number :"+" "+num);
		}
		
		//************************************************/
		
	/*for(int i=2;i<3;i++) {
			System.out.println(i);
		}
		//**************************************************/
		
		
		//factorial
		
	/*	int num=5;
		int fact=1;
		
		for(int i=1;i<=5;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
		
	//**************************************************/
		//print to multiples of 3 and 6 in a given arry?
		
	/*	int num[]= {12,56,8,63,45,46,85,99,20,99,45};
		for(int i=0;i<num.length;i++){
			if(num[i]%3==0 && num[i]%6==0) {
				System.out.println(num[i]);	
			}
				
			}
		*/
		
		//*********************************************/
	
	//	18. Write a program to count the number of Vowels and Consonants in given String
		
	/*	int vowles=0;
		int consonent=0;
		
		String sen="AEIOU";
		
		char stor[]=sen.toCharArray();
		
		for(int i=0;i<stor.length;i++) {
				if(stor[i]=='a' || stor[i]=='e' || stor[i]=='i' || stor[i]=='o' || stor[i]=='u'
						||stor[i]=='A' || stor[i]=='E' || stor[i]=='I' || stor[i]=='O' || stor[i]=='U') {
				vowles++;
			}else if(stor[i]==' ') {
				continue;
			}else {
				consonent++;
			}
		}
		System.out.println("vowles :" +" "+vowles);
		System.out.println("consonent :"  +" "+consonent);
	
		
	//***************************************************/	
		
		//9. Write a program to swap two numbers
		
		
	 /*   int a=1;
		  int b=2;
		  int c;
		
	       c=a;
	       a=b;
	       b=c;
		
		System.out.println("a ="+" "+a);
		System.out.println("b ="+" "+b);
		
	 //*****************************************************/	
		
		//Fibonachi Series
		
	/*	int f=0;                                   //0,1,1,2,3,5
		int s=1;								  //1,1,2,3,5,8
		int t;                                   
		int n=8;
		 
		 System.out.print(f);					//	0,1,1,2,3,5
		 System.out.print(" ,"+s);              //1,1,2 ,3 ,5,8
		 
		 for(int i=2;i<n;i++) {
			 t=f+s;                          
			 System.out.print(", "+t);          //1,2,3,5,8,13
			 f=s;                       
			 s=t;
		 
		 }
		 
		//***********************************************************************************/ 
		 
		//write a program:                           
		//	1)     1 2 3 4 5                                              
		//	        1 2 3 4                                     
		//	        1 2 3
		//	        1 2
		//	        1
		
	/*	int n=5;
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}*/
			 
	}
}
