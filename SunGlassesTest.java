class SunGlassesTest{
	//class =class is design it contanes states and Behaviours
	// static data consider as class members
	// instance data consider as object members
	
	// static member(variables , method) are called as class members  where as instance
	//member(variables, methods)are called as object members
	// static vs instance
	
	//static data loded after the class ceation
	//instace data loded after the object creation
	public static void main(String []args){
		
		SunGlasses gls=new SunGlasses();
		gls.name="Fastrack";
		gls.price=750;
		gls.warrenty="1year";
		gls.cool();
		
		System.out.println(gls.name+" "+gls.price+" "+gls.warrenty);
		
		SunGlasses gls1=new SunGlasses();
		gls1.name="Raybon";
		gls1.price=890;
		gls1.warrenty="1year";
		gls.cool();
		
		System.out.println(gls1.name+" "+gls1.price+" "+gls1.warrenty);
		
		SunGlasses sun=gls1;
		System.out.println(sun.name+" "+sun.price+" "+sun.warrenty);
		
		SunGlasses gls2=new SunGlasses();
		gls2.name="Rich club";
		gls2.price=1050;
		gls2.warrenty="1year";
		gls2.cool();
		
		System.out.println(gls2.name+" "+gls2.price+" "+gls2.warrenty);
		
				SunGlasses gls3=new SunGlasses();
		gls3.name="Titan Eye+";
		gls3.price=2000;
		gls3.warrenty="1year";
		gls3.cool();
		
		System.out.println(gls3.name+" "+gls3.price+" "+gls3.warrenty);
		
	}
	
}