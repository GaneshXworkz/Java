class SoapTester{
   
   public static void main(String a[]){
   
    // create a multiple of Soap
	//-purpose of object is tocreate a multiple copy of class
	// object is a instance of class 
	//create a multiple copy
	
	
	//className ref = new className() ;
	Soap soap = new Soap() ;
	
	soap.shape = "Oval";
	soap.color = "cream";
	soap.name = "Mysore Sandal Soap";
	 System.out.println(soap.shape +" " +soap.color +" "+soap.name);
	
	Soap soap1 = new Soap();
	soap1.shape = "Rectangle";
	soap1.color = "White";
	soap1.name = "Fiama";
		 System.out.println(soap1.shape +" " +soap1.color +" "+soap1.name);
	
   }
   
  
   
   
}