class Factorial{
	
	public static int fact(int n){
		
		int factorial =1;
		
		for(int i=1; i<=n; i++){
			factorial= factorial*i;
		}
		
		return factorial;	
	}
	
	
	public static void main(String[] args){
		 
		 int n=5;
		int ref= Factorial.fact(n);
		System.out.println(ref);
		
		
	}
	
	
}