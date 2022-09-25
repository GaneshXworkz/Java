class RailwayTester{
	
	public static void main(String args[]){
		
		Railway.setStationName("Davanaere");
		Railway.setStationId("SWR178956");
		Railway.setStationManager("yaswanth row");
	     Railway.setStationContactNo(7895464656L);
		Railway.setTrainShedule("18725-HampiExpress-21.00 ,13577-darwad express-13.00 ,17788- yashwantpur intercity express-15.45");
		
		
		System.out.println(Railway.getStationName()+"\n"+Railway.getStationId()+"\n"+Railway.getStationManager()+"\n"+Railway.getTrainShedule()+ "\n"+Railway.getStationContactNo());
		
		
		
		
		
		
	}
	
	
	
	
}