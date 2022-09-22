import java.util.Scanner;
class Ab{
	
	/* first take user input of total loan amount
	then take input of Percentage of interest
	then take input of total duration in months
	
	and program output should be 
	
	show Total loan amount + total interest till specified duration.
	*/
	
	public static void main(String[] args){
	Scanner scanner=new Scanner(System.in);
	System.out.println("loan amount");
	int loan=scanner.nextInt();
	System.out.println("percentage");
	int  percentage=scanner.nextInt();
	System.out.println("duration in years");
	int duration=scanner.nextInt();
	
	int per =(loan*percentage/100);
	int amount =(per*12*duration);
	
	System.out.println(amount);
	
		
		
		
		
		
		
	}
	
	
}