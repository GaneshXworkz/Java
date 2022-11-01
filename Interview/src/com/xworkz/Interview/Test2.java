package com.xworkz.Interview;

public class Test2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int evenNo=0;
		int odd=0;
		int len=0;
		
		
		int num[]= {3,45,56,67,8,12,3,5,7,9,102,34,4,5};
		
			
	
		for(int l=0; l<num.length;l++) {
			if(num[l]%2==0) {
				evenNo+=1;
			}else {
				odd+=1;
			}
		}
		for(int k=0;k<num.length;k++) {
			len+=1;
		}
		
		System.out.println("even No :"+evenNo);
		System.out.println("odd No :"+odd);
		System.out.println("length of array  :"+len);
		
		
	//factorial	
		
		int n=5;
		int fact=1;	
		
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		
		System.out.println("fectorial  :"+ fact);
		
		
		
		
		/*for(int i=2;i<3;i++) {
			System.out.print(i +" ");
		}
		
		int count=0;
		int num[]= {3,23,56,78,56,21,56,99,100,200,450};
		
		for(int i=0;i<num.length;i++) {
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count+=1;
				}
			}
			if(count==2) {
				System.out.println(i);
			}

		}*/
		
		
		
		
		
		
		
		
	}

}
