class Airport{
	static String airportNames[]={null,null,null,null,null};
	static int i;

	public static boolean addAirportName(String airportName){
	System.out.println("inside add beach name");
	
	if(airportNames.length>i){
		airportNames[i]=airportName;
		i++;
		return true;
	}
		else{
			System.out.println("error");
			
		}
		System.out.println("end of AirportName");
		return false;	
	}
	public static void getAirportName(){
		for(int i=0;i<airportNames.length;i++){
			System.out.println(airportNames[i]);
		}
	}
	
	}
	
