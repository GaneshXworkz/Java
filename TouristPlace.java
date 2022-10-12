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
		
		public static void findTouristPlaceNames(String touristPlaceName){
			System.out.println("inside find Tourist PlaceNames");
			for(int i=0 ;touristPlaceNames.length>i;i++){
				if(beachName !=null && touristPlaceNames[i]=touristPlaceName){
					String ref= touristPlaceName[i];
					System.out.println("tourist PlaceName" +ref);
				}else {
					System.out.println("Error");
				}
				
				
			}
		}

}