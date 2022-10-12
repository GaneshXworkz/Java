class TajHotelTest{
	
	public static void main(String args[]){
		
		TajHotel taj=new TajHotel();
		taj.name="TajHotel";
		taj.address="mumbai";
		taj.contactNo=9845623578L;
		taj.manager="mani";
		
		System.out.println(taj.name+" "+taj.address+" "+taj.contactNo+" "+taj.manager);
		
		TajHotel taj1=new TajHotel();
		taj1.name="Pooja Hotel";
		taj1.address="Davanagere";
		taj1.contactNo=978923578L;
		taj1.manager="Deavaraj";
		
		System.out.println(taj1.name+" "+taj1.address+" "+taj1.contactNo+" "+taj1.manager);
		
		
		TajHotel taj2=new TajHotel();
		taj2.name="Sarovra";
		taj2.address="Davanagere";
		taj2.contactNo=9845623578L;
		taj2.manager="Avinash";
		
		System.out.println(taj2.name+" "+taj2.address+" "+taj2.contactNo+" "+taj2.manager);
		
		TajHotel taj3=new TajHotel();
		taj3.name="Ashoka";
		taj3.address="Davanagere";
		taj3.contactNo=9889623578L;
		taj3.manager="Ashoka";
		
		System.out.println(taj3.name+" "+taj3.address+" "+taj3.contactNo+" "+taj3.manager);
		
		TajHotel taj4=new TajHotel();
		taj4.name="OyO";
		taj4.address="Banglore";
		taj4.contactNo=9845623578L;
		taj4.manager="OyO";
		TajHotel.toStay();
		
		
		System.out.println(taj4.name+" "+taj4.address+" "+taj4.contactNo+" "+taj4.manager);
		
		
		
	}
	
	
	
}