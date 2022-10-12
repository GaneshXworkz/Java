class FestivalsTest{
	
	public static void main(String []args){
		
		Festivals fest=new Festivals();
		fest.name="Deepavali";
		fest.date="24-oct-2022";
		fest.food="Holige, kadubu, Sweets";
		fest.purpose="Rama killed Ravana";
		
		System.out.println(fest.name +" "+fest.date+" "+fest.food+" "+fest.purpose);
		
		Festivals fest1=new Festivals();
		fest1.name="Raksha bandan";
		fest1.date="17-aug-2022";
		fest1.food=" Sweets";
		fest1.purpose="brother and Sister";
		
		System.out.println(fest1.name +" "+fest1.date+" "+fest1.food+" "+fest1.purpose);
		
		Festivals fest2=new Festivals();
		fest2.name="holi";
		fest2.date="24-mar-2022";
		fest2.food="Holige";
		fest2.purpose="Frindship and bonding";
		
		System.out.println(fest2.name +" "+fest2.date+" "+fest2.food+" "+fest2.purpose);
		
		Festivals fest3=new Festivals();
		fest3.name="Dhasara";
		fest3.date="5-oct-2022";
		fest3.food="Holige, kadubu, Sweets";
		fest3.purpose="godess Chamundi killed Mahishasura";
		
		System.out.println(fest3.name +" "+fest3.date+" "+fest3.food+" "+fest3.purpose);
		
		
	}
	
	
}