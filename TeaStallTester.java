class TeaStallTester{
	
	public static void main(String args[]){
		//set of informatiom
		TeaStall.setTeaStallId(4556);
		TeaStall.setTeastallName("cofee DaY");
		TeaStall.setTeastallAddress("rajajginagara"); 
		TeaStall.setTeastallContactNo(9000520052L);
		
		//get informatiom
		System.out.println(TeaStall.getTeaStallId()+"/n"+ TeaStall.getTeastallName()+"/n"+ TeaStall.getTeastallAddress()+"/n"+ TeaStall.getTeastallContactNo());
		
	}
}