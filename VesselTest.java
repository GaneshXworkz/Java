class VesselTest{
	
	public static void main(String args[]){
		
		Vessel.setBrandName("Prastige");
		Vessel.setWebSite("www.prastige.com");
		Vessel.setAddress("Banglore");
		Vessel.setContectNo(4567891230L);
		
		System.out.println(Vessel.getBrandName()+"\n"+Vessel.getWebSite()+"\n"+Vessel.getAddress()+"\n"+Vessel.getContectNo());
		
	}
	
	
	
	
	
}