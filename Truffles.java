class Truffles{
	
	public static void main(String[] args){
	
		String type="5 star";
		String address="koramangala";
		String managerNames[]={"devaraj","ravi","rohan","peater","sam","prajwal"};
		String noOfManager="6";
		String foodMenu[]={"Tava chicken","chicken tandoori masala","kadal mutton","kadai prawns","mutton coconut fry","kadai fish","chicken mughlai","hyderabadi chicken","mutton onion roast","kadai prawns","tawa chicken"
	                   ,"mutton coconut fry boneless","mutton onion roast","roti","fish fry","soops","kadai"};
	
		System.out.println("type--->  :" +type);
		System.out.println("address--->:" +address);
		System.out.println("noOfManager--->:" +noOfManager);
	
		System.out.println("\n"+"------------------------------------------"+"\n"+"managerNames"+"\n"+"------------------------------------------");
		for(int i=0;i<managerNames.length;i++){
		System.out.println((i+1)+" "+managerNames[i]);
		}
		
			
		System.out.println("\n"+"------------------------------------------"+"\n"+"foodMenu"+"\n"+"------------------------------------------");		
		for(int i=0;i<foodMenu.length;i++){
		System.out.println((i+1)+" "+foodMenu[i]);	
		}		
			
		}
	
		
}