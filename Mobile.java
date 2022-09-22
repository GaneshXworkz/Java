class Mobile{
	
	static boolean isConnected;
	
	public static boolean onOrOff(){
		System.out.println("inside oN Or Off");
	if(isConnected==false){
		  isConnected=true;
		System.out.println("on");	
	}else if(isConnected==true){
		isConnected=false;
		System.out.println("off");
	}return isConnected;
		
		
	}
	
	
	
	
	
}