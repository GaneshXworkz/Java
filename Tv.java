class Tv{
	static String brand;
	static String price;
	static String colour;
	static boolean isConnected;
	
	public static boolean onOrOff(){
		System.out.println("inside onOrOff");
		if(isConnected==false){
			isConnected= true;
		System.out.println("Tv is on..");
		}
		else if(isConnected==true){
			isConnected=false;
			System.out.println("Tv is Off..");
			
	}
	return isConnected;
}
}