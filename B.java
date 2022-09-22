// Calculate the percentage of the student having 8 subjects of maximum marks 100 per subject.
//case.1* consider that student has failed to pass in subject{ pass marks 45}...print(the student has failed to clear this semester);
 import java.util.Scanner;
 class B{
	 public static void main(String[] args){
	 Scanner scanner= new Scanner(System.in);
	 System.out.println("suj 1 markes");
	 int sub1 =scanner.nextInt();
	 System.out.println("suj 2 markes");
	 int sub2 =scanner.nextInt();
	 System.out.println("suj 3 markes");
	 int sub3=scanner.nextInt(); 
	 System.out.println("suj 4 markes");
	 int sub4 =scanner.nextInt(); 
	  System.out.println("suj 5 markes");
	 int sub5 =scanner.nextInt();
	  System.out.println("suj 6 markes");
	 int sub6 =scanner.nextInt();
	 System.out.println("suj 7 markes");
	 int sub7 =scanner.nextInt();
	 System.out.println("suj 8 markes");
	 int sub8 =scanner.nextInt();

	int total=(sub1+sub2+sub3+sub4+sub5+sub6+sub7+sub8);
	int percent=(total/8);
	
	if(sub1<45){
	System.out.println("failed");}
		if(sub2<45){
		System.out.println("failed");}
			if(sub3<45){
			System.out.println("failed");}
				if(sub4<45){
				System.out.println("failed");}
					if(sub5<45){
					System.out.println("failed");}
								if(sub6<45){
								System.out.println("failed");}
									if(sub7<45){
									System.out.println("failed");}
											if(sub8<45){
											System.out.println("failed");}

			else{
		System.out.println("percentage of subject    :"+ percent);
	}
	 
 }
	 
 }