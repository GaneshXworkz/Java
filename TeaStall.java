class TeaStall{
	static int teaStallId;
	static String teaStallname;
	static String address;
	static long contactNo;

	static void setTeaStallId(int id){
		teaStallId=id;
	}
	static int getTeaStallId(){
		return teaStallId;
	} 
	static void setTeastallName(String nam){
		teaStallname =nam;
	}
	static String getTeastallName(){
	       return	teaStallname;
	}
	static void setTeastallAddress(String addre){
		address =addre;
	}
	static String getTeastallAddress(){
	       return address;
	}
	static void setTeastallContactNo(long coN){
		contactNo = coN;
	}
	static long getTeastallContactNo(){
	       return contactNo;
	}
	
}