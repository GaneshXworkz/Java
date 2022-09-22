class EmpireHotel{
	public static void main(String [] a){
		
		String type ="5 star Hotel"; 	
		String address = "J.p. nagara";
		String contectNo="251-2321-232";
		String managerNames[] ={"Shivu","Mahendra","Varun","Ganesh","Chethan"};
		int noOfManager =5;
		String foodMenu[] ={"Crispy Chicken","Classic Chicken","Spicy Grilled Chicken","Chicken Masala","Chicken Whopper","kadai Chicken Boneless","Mutton Whopper","Arabic Whopper","mutton coconut fry boneless","mutton onion roast","roti","fish fry","soops","kadai"};
		
		
		System.out.println("type--->  :" +type);
		System.out.println("address--->:" +address);
		System.out.println("noOfManager--->:" +noOfManager);
		System.out.println("contectNo----> :" +contectNo);
		
		System.out.println("\n"+"------------------------------------------"+"\n"+"No Of Manager"+"\n"+"------------------------------------------");
		for(int m=0; m<managerNames.length; m++){
			System.out.println((m+1)+" "+managerNames[m]);
		}
		System.out.println("\n"+"------------------------------------------"+"\n"+"food Menu"+"\n"+"------------------------------------------");
		for(int f=0; f<foodMenu.length; f++){
			System.out.println((f+1)+" "+foodMenu[f]);
		}


		
			
		}
	

}