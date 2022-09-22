class WashingMachine{
	
	static  boolean isConnected;
	static int minSpeed;
	static int maxSpeed=6;
	static int currentSpeed;
	
	public static boolean onOrOff(){
		System.out.println("inside onOrOff");
	if(isConnected==false){
		isConnected=true;
		System.out.println("switch is on...");	
	}else if(isConnected==true){
		isConnected=false;
		System.out.println("switch is off...");
	}return isConnected;
	
	}
	public static void increaseSpeed(){            //--->2
		if(isConnected==true){
		if(currentSpeed<maxSpeed){
			currentSpeed= currentSpeed+1;
		System.out.println("the currentspeed is    "+currentSpeed);
		}
		else{
			System.out.println("max speed reached....");
		}
		}
		else{
			System.out.println("please switch on the speaker");
		}
	}
	
	 public static void decreaseSpeed(){
		if(isConnected==true){
		if(currentSpeed>minSpeed){
			currentSpeed=currentSpeed-1;
			System.out.println("the currentSpeed is   "+currentSpeed);
		}else{
			System.out.println("min speed reached.....");
		}	
			
		} else{
			System.out.println("please turn on the speaker");
		}	 
		 
	 }
	

	}
	                          