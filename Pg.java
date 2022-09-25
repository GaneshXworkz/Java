class Pg{
	static String pgName;
	static long contectNo;
	static String address;
	static String shearings;
	static String facility;
	
	static void setPgname(String nam){
		pgName=nam;
	}
	static String getPgname(){
		return pgName ;
	}
		static void setContectNo(long no){
		contectNo=no;
	}
	static long getContectNo(){
		return contectNo ;
	}
	
		static void setAddress(String adr){
		address=adr;
	}
	static String getAddress(){
		return address ;
	}
	
		static void setShearings(String shr){
		shearings =shr;
	}
	static String getShearings(){
		return shearings ;
	}
	
		static void setFacility(String fec){
		facility=fec;
	}
	static String getFacility(){
		return facility ;
	}
}