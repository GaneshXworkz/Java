class Television{
	static String brandName;
	static String color;
	static double price;
	static boolean isConnected;
	static int minSound;
	static int maxSound=6;
	static int currentSound;
	
	public static boolean onOrOff(){
	if(isConnected==false){
		isConnected=true;
		System.out.println("Tv is on....");
	}else if(isConnected==true){
		isConnected=false;
		System.out.println("Tv is off....");
	}return isConnected;	
		
	}
		public static void increaseSound(){
			if(isConnected==true){
				if(currentSound<maxSound){
					currentSound= currentSound+1;
						System.out.println("maxsound is... "+ currentSound);
				}else{
					System.out.println("it reached maxSound");
				}
			}
			else{
				System.out.println("please Ternon Tv");
			}
		}
		
		
		public static void decreaseSound(){
			if(isConnected==true){
				if(currentSound>minSound){
					currentSound= currentSound-1;
						System.out.println("minSound is..."+ currentSound);
				}else{
					System.out.println("it is minSound");
					
				}
			}
			else{
				System.out.println("please switch on TV");
			}
		}




		
		}
	
