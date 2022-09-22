class Ac{
	static boolean isConnected;
	static int maxCooling =5;
	static int minCooling;
	static int currentCooling;
		
	
	public static boolean onOrOff(){
		if(isConnected==false){
			isConnected=true;
			System.out.println("on");
		}else if(isConnected==true){
			isConnected=false;
			System.out.println("off");
		}return isConnected;
	}
		
		public static void increaseCooing(){
			if(isConnected==true){
				if(currentCooling<maxCooling){
					currentCooling=currentCooling + 1;
						System.out.println("increaseCooing  :" + currentCooling);
				}else{
						System.out.println("it is maxCooling");
				}
			}else {
				System.out.println("please put power on");
			}
		}
	
		public static void decreaseCooling(){
			if(isConnected==true){
				if(currentCooling>minCooling){
					currentCooling=currentCooling-1;
						System.out.println("decreaseCooling   :"+currentCooling);	
			
				}else{
					System.out.println("it in minCooling ");
				}
			}else {
				System.out.println("please switch on the AC");
			}
		}
	
}