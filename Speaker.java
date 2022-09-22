class Speaker{
	static String brand;
	static String colour;
	static double price;
	static boolean isConneted;
	static int minVolume;
	static int maxVolume=6;
	static int currentVolume;
	
	
	 public static boolean onOrOff(){                //---->1
	System.out.println("inside onOrOff");
		if(isConneted==false){
		  isConneted =true;
		 System.out.println("speaker is turned onn..");
		}
	    else if(isConneted==true){
		   isConneted=false;
		 System.out.println("speaker is turned off..");
	 } System.out.println("end of onOrOff()");
	    return isConneted ;
	 }
	 
	 
	public static void increaseVolume(){            //--->2
		if(isConneted==true){
		if(currentVolume<maxVolume){
			currentVolume= currentVolume+1;
		System.out.println("the currentVolume is    "+currentVolume);
		}
		else{
			System.out.println("max volume reached....");
		}
		}
		else{
			System.out.println("please switch on the speaker");
		}
	}

	public static void decreaseVolume(){    //--->3
		if(isConneted==true){
			if(currentVolume>minVolume){
				currentVolume=currentVolume-1;
					System.out.println("the currentVolume is  "+currentVolume);
			}
				else{
					System.out.println("min Volume is reached");
		    }
		    }
				else{
					System.out.println("please switch on the speaker");
		   }	
				
     }
		
		
	}
                                                                