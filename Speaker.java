class Speaker{
	static String brand;
	static String colour;
	static double price;
	static boolean isConneted;
	
	
	
	 public static boolean onOrOff(){
	System.out.println("inside onOrOff");
		if(isConneted==false){
		  isConneted =true;
		 System.out.println("speaker is turned onn..");
		}
	    else if(isConneted==true){
		   isConneted=false;
		 System.out.println("speaker is turned off..");
	 }
	   System.out.println("end of onOrOff()");
	    return isConneted ;
	 
	 
	 }

// television, Ac , Washingmachin, mobiel,torchSS














}