class Npr{
	
	public static int inNpr(int n){
		
		int factorial=1;
		for(int i=1;i<=n;i++){
			factorial=factorial*i;
		}
		return factorial;
		
	}
		public static void main(String[] args){
			int n=5;
			int r=3;
			int ref=Npr.inNpr(n)/Npr.inNpr(n-r);
			System.out.println(ref);
			
			
		}

	
}

//npr =n!/(n-r)!
//ncr=n!/(n-r)!*r!