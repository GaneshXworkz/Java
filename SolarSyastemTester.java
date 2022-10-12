class SolarSyastemTester{

   public static void main(String a[]){
   
   SolarSyastem planet = new SolarSyastem() ;
	planet.name = "Earth";
    planet.age = "4.543 billion years";
	planet.distenceFromSun = "149.6 million km";
	planet.water = "70%";
	System.out.println(planet.name +" \n  "+ planet.age +" \n "+planet.distenceFromSun+" \n "+planet.water);
	
	SolarSyastem planet1 = new SolarSyastem() ;
	planet1.name = "Jupiter";
    planet1.age = "4.603 billion years";
	planet1.distenceFromSun = "778.5 million km";
	planet1.water = "0.25%";
	System.out.println(planet1.name +" \n  "+ planet1.age +" \n "+planet1.distenceFromSun+" \n "+planet1.water);
	
	SolarSyastem planet2 = new SolarSyastem() ;
	planet2.name = "Saturn";
    planet2.age = "4.503 billion years";
	planet2.distenceFromSun = "1.434 billion km";
	planet2.water = "60%";
	System.out.println(planet2.name +" \n  "+ planet2.age +" \n "+planet2.distenceFromSun+" \n "+planet2.water);
	
	SolarSyastem planet3 = new SolarSyastem() ;
	planet3.name = "Mars";
    planet3.age = "4.603 billion years";
	planet3.distenceFromSun = "227.9 million km";
	planet3.water = "14%";
	System.out.println(planet3.name +" \n  "+ planet3.age +" \n "+planet3.distenceFromSun+" \n "+planet3.water);
	
	SolarSyastem planet4 = new SolarSyastem() ;
	planet4.name = "Mercury";
    planet4.age = "4.503 billion years";
	planet4.distenceFromSun = "58 million km";
	planet4.water = "80%";
	System.out.println(planet4.name +" \n  "+ planet4.age +" \n "+planet4.distenceFromSun+" \n "+planet4.water);
	
	}
	
}