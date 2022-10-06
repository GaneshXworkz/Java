class BeachName{
	static String beachNames[]={null,null,null,null,null,null};
	static int i;
	public static void addBeachNames(String beachName){
		if(beachNames.length>i){
			beachNames[i]=beachName;
			i++;
		}else{
			System.out.println("error");
		}
		

		}
		
	public static void getBeachNames(){
		for(int i=0;beachNames.length>i;i++){
		
				System.out.println(beachNames[i]);
			}
		}
	}
		
		

	
	
	
	
	
	
	
	
