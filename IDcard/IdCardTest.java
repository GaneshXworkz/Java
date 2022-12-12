package com.xworkz.Abstract.IDcard;

public class IdCardTest {
	
	public static void main(String[] args) {
		
		IdCard id=new SbiBank();
		id.swip();
		
		IdCard id1=new HdfcBank();
		id1.swip();
		
		IdCard id2=new IciciBank();
		id2.swip();
		
		
		
	}

}
