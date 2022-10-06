class TouristPlace{
	static String touristPlaceNames[]={"","","","","",};
	static int i;
		
		public static boolean setTouristPalceName(String touristPlaceName){
			System.out.println("added");
				if(touristPlaceNames.length>i){
					touristPlaceNames[i]=touristPlaceName;
						i++;
			return true;
		}else{
			System.out.println("Error");
		
		}
			return false;
		
		}

		public static void  getTouristPlaceNames(){
			for(int i=0;touristPlaceNames.length>i;i++){
				System.out.println(touristPlaceNames[i]);
			}
		
		}

}