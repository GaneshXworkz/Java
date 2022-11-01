package com.xworkz.Interview;

public class FirstLetterOfStringUppercase{
	
		public static void worrdUpperCase(String name) {
		
		String a[]=name.split(" ");
			
			for(int i=0;i<a.length;i++) {
			
				char c=a[i].charAt(0);      
					// out put for c--->m n i g , *it give will give and store first char of word
			
					String upper=String.valueOf(c).toUpperCase();
						//String.valaueof(c)--->if you will pass it will get converted into string
						// toUpperCase()--->it will convert to upper case letter
						// output-->M N I G
					
						String sub=a[i].substring(1);
							//IT will exclude first char of every word.
							//output -->y ame is annii
						
					System.out.print(upper+sub+" ");
						//System.out.println(sub);
		}		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//revereseMiddleWords("my name is devendra");


	worrdUpperCase("my name is ganii");	
	}
}
