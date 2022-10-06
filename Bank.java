class Bank{
	
	static String bankNames[]={"","","","","","","",""};
	static int i;

	public static void addBankName(String bankname){
	System.out.println("add thae bankname");
	if(bankNames.length>i){
		bankNames[i]=bankname;
		i++;
	}else{
		System.out.println("Error");
	}
	System.out.println("add is ended");

	}
	public static void getBankname(){
	for(int i=0;bankNames.length>i;i++){
		System.out.println(bankNames[i]);
	}
	
	}
}