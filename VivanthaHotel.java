class VivanthaHotel{

	public static void main(String[] args){
		
		String type ="5 star Hotel";
		String address="yashwanthpur";
		String[] managerNames={"akshata","lakshmi","sangeeta","Ganesh","sumanth"};
		int noOfManagers=5;
		String starters[]={"papad","soops","gobi manchuri","mashroom manchuri","pani puri","fritters"};
		String foodmenu[]={"roti ","chicken biriyni","vegtable pullva","egg dum-biriyani","veg fridrice","fish fry","fish kurry","mutton biriyani"};
		String softdrinks[]={"fruits juice","ice-cream","lussy","lemon juice","masala soda","pepsi","badama milk","scoops","fruits mix"};
	
	
	System.out.println("type of hotel --->   :"+type);
	
	
	System.out.println("destination ----->     :"+address);
	
	System.out.println("\n"+"------------------------------------------"+"\n"+"list of manger"+"\n"+"------------------------------------------");
	for(int i=0;i<managerNames.length;i++){
		System.out.println( managerNames[i]); 
	}
	
	System.out.println("\n"+"------------------------------------------"+"\n"+"list of starters"+"\n"+"------------------------------------------");
		for(int i=0;i<starters.length;i++){
		System.out.println( starters[i]); 
	}
	
	System.out.println("\n"+"------------------------------------------"+"\n"+"list of foodmenu"+"\n"+"------------------------------------------");
	for(int i =0;i<foodmenu.length;i++){
		System.out.println( foodmenu[i]); 
	}
	System.out.println("\n"+"------------------------------------------"+"\n"+"list of softdrinks"+"\n"+"------------------------------------------");
	for(int i=0;i<softdrinks.length;i++){
		System.out.println( softdrinks[i]); 
	}
	
	
	
	
	}






}