class BankUser{
	static String names[]={"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
	static String addresses[]={"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
	static String panNos[]={"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
	static String aadhaarNos[]={"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
	static String emails[]={"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
	static int index;
	//static int cif[]={0,0,0,0,0,0,0,0,0,0}
	//static int accountNo[]={0,0,0,0,0,0,0,0,0,0}
	static void setBankDetails(String name,String address,String panNO,String aadhaarNo,String email){
		if(name!="" && name!=null){
			if(index<names.length){
				names[index]=name;
				addresses[index]=address;
				panNos[index]=panNO;
				aadhaarNos[index]=aadhaarNo;
				emails[index]=email;
				index+=1;
				}else{
					System.out.println("Max limit reached. Contact admin for assistance");
				}
	}
	}
	static void getBankDetails(){
		for(int i=0;i<names.length;i++){{
			if(names[i]==""){}else{
			System.out.println(names[i]+"  "+ addresses[i]+"  "+ panNos[i]+"  "+aadhaarNos[i]+"  "+ emails[i]);
		}}
		
	}
	System.out.println("");
	}
	
	static void findUserAadhaar(String aadhaar){
		if(aadhaar.length()>0 && aadhaar.length()<=12){
			for(int i=0;i<aadhaarNos.length;i++){
				if(aadhaarNos[i]==aadhaar){
			System.out.println(names[i]+"  "+ addresses[i]+"  "+ panNos[i]+"  "+aadhaarNos[i]+"  "+ emails[i]);
				}
			}
		}
	}
	
	
	
	/*
	static void setName(String name){
		if(name!="" && name!=null){
			if(index<names.length){
				names[index]=name;
				index+=1;
				}else{
					System.out.println("Max limit reached. Contact admin for assistance");
				}
	}
	}
	static void setAddress(String address){
		if(address!="" && address!=null){
			if(index<addresses.length){
				addresses[index]=address;
				index+=1;
				}else{
					System.out.println("Max limit reached. Contact admin for assistance");
				}
	}
	}
	static void setPanNo(String panNos){
		if(panNos!="" && panNos!=null){
			if(index<panNos.length){
				panNos[index]=panNos;
				index+=1;
				}else{
					System.out.println("Max limit reached. Contact admin for assistance");
				}
	}
	}
	static void setAadhaarNos(String aadhaarNo){
		if(aadhaarNo!="" && aadhaarNo!=null){
			if(index<aadhaarNos.length){
				aadhaarNos[index]=aadhaarNo;
				index+=1;
				}else{
					System.out.println("Max limit reached. Contact admin for assistance");
				}
	}
	}
	static void setEmail(String email){
		if(name!="" && name!=null){
			if(index<names.length){
				names[index]=name;
				index+=1;
				}else{
					System.out.println("Max limit reached. Contact admin for assistance");
				}
	}
	}
	*/
	}
	
	
	