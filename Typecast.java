	
	
	import java.util.*;
	class Typecast{

		public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter principal amount in rupees");
		int principal = sc.nextInt();
		System.out.println("rate of intrest in %");
		float rate = sc.nextFloat();
		System.out.println("");
		int time = sc.nextInt();
		float simpleintrest = principal*rate*time/100;
		
		System.out.println("simpleintrest  :" + simpleintrest);



 
		}		
			
		}
	