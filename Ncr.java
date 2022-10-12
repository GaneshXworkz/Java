class Ncr{

	public static int incr(int n){
	
		int factorial=1;
		
		for(int i=1;i<=n;i++){
			factorial=factorial*i;
		
		}
		return factorial;
	}
	
	public static void main(String[] args){
		
		int ref= Ncr.incr(5)/ Ncr.incr(5-3)* Ncr.incr(3);
		System.out.println(ref);
	
	
	}


}