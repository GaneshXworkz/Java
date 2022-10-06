class BankUserTester{
public static void main(String []args){
	
//String name,String address,String panNO,long aadhaarNo,String email){
	BankUser.setBankDetails("Ganesh","DVG","DCZMK0133G","488473702816","example@mail.com");
	BankUser.setBankDetails("Ganesh1","DVG1","DCZMK0133G1","488473702811","example@mail.com1");
	
	BankUser.getBankDetails();
	BankUser.findUserAadhaar("488473702811");
		BankUser.findUserAadhaar("488473702816");
	
}	
}