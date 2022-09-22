import java.util.Scanner;
	class Cal{
		
		public static void main(String[] args) throws InterruptedException{
			 
		Scanner scanner=new Scanner(System.in);
	
	System.out.println("enter first number :"   );
	int c=scanner.nextInt();
	
	/* abcd\n 
	2\n
	\n
	+\n
	*/
	System.out.println("enter operater to be performed   :"   );
	int result=0;
	scanner.nextLine();
	char operation=scanner.nextLine(). charAt(0);
	
	
	System.out.println("enter second number   :"  );
	int b=scanner.nextInt();
	
	
	
	switch(operation){
	case '+':
		result=c+b;
		break;
	case '-':
		result=c-b;
		break;	
	case '*':
		result=c*b;
		break;
	case '/':if(b==0){
		System.out.println("invalid division");
	}else {
		System.out.println(c/b);
	}
	break;
	case '%':if(b==0){
		System.out.println("invalid division");
	}else{
		System.out.println(c%b);
	}
		break;		
	default:
			System.out.println("invalid operation");
	}
	System.out.println("the result is  :" +  result);
		}		
			
			
		}
			
	
		















 //import java.util.Scanner;
// class DataCollect{
	// public static void main(String[] args){
		 
		// Scanner scanner =new Scanner(System.in);
		// System.out.println(" enter first number");
		// int a=scanner.nextInt();
		 //System.out.println(" enter second number");
		 //int b=scanner.nextInt();
		 //System.out.println(" enter operation to be performed");
         //int operater=scanner.nextInt();

	//switch(operater){
	//case 1: System.out.println(a+b);
	//break;
	//	case 2: System.out.println(a-b);
	//break;
		//case 3: System.out.println(a*b);
	//break;
		//case 4: if(b==0){
	//System.out.println(" invalid division");
	//	} else {
//System.out.println(a/b);
		//}
		//break;
	//case 5 :if(b==0){
//System.out.println(" invalid division");
	//} else{
//System.out.println(a%b);		
	//}
	//break;
//default :System.out.println("invalid operater");
		//}
//	}
//}

	
    // {
		//case (number>=1  number<=34):
		//System.out.println("fail");
		//break;
		
		//case (number>=35 number<=75):
		//System.out.println("first class");
		//break;
		
		//case (number>=76 number<=100):
		//System.out.println("distention");
		//break;
		// }
 		 	 
		 
	  //Scanner scanner = new Scanner(System.in); 
	  
	  //System.out.println("What is your name");
	 // String name =scanner.nextLine();
	  
	 // System.out.println("What is your age");
	 // int age =scanner.nextInt();
	  //scanner.nextLine();
	  //System.out.println("What is your favorite food");
	  //String food =scanner.nextLine();
	  
	  //System.out.println("What is amount food");
	 //int prize=scanner.nextInt();
	 
	 
	 
	// } 
	 
	 
 
//}