package com.xworkz.constrecter;

public class ConstercterTest {
	
	{
		//instance block
	}
	static {
		//static block
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constrecter ref=new Constrecter();
		System.out.println(ref.name+""+ref.gstNo+" "+ref.address);
		ref.name="chaiwala";
		ref.gstNo=123;
		ref.address="Rajajinagara";
		System.out.println(ref.name+" "+ref.gstNo+" "+ref.address);
		
		
		
		
		
		
		
		
		
	}

}
