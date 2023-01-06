package com.xworkz.Collection.CompareToAndStream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class WeaponTest {
	
	public static void main(String[] args) {
		
		Collection<WeaponDTO> ref=new ArrayList<WeaponDTO>();
		
		ref.add(new WeaponDTO("ShortGun slug","India","Steel",2000.00,Type.shortgun) );
		ref.add(new WeaponDTO("KEL-TEC ksg","United States","Steel ",8000.00,Type.shortgun) );
		ref.add(new WeaponDTO("Armsel Striker","south Africa","Gun matel",9000.00,Type.shortgun) );
		ref.add(new WeaponDTO("Armsel Striker","south Africa","Gun matel",10000.00,Type.shortgun) );
		ref.add(new WeaponDTO("M-26","United States","Steel",20000.00,Type.shortgun) );

		ref.add(new WeaponDTO("Astra A-60  ","Spain","Metal",3000.00,Type.handgun) );
		ref.add(new WeaponDTO("Beretta M9  ","Italy","Metal",1500.00,Type.handgun) );
		ref.add(new WeaponDTO("Beretta Pico  ","United States","Metal",2999.00,Type.handgun) );
		ref.add(new WeaponDTO("Fn Model 1910  ","Belgium","Metal",1550.00,Type.handgun) );
		ref.add(new WeaponDTO("Glock 17  ","Austria","Metal",3000.00,Type.handgun) );

		ref.add(new WeaponDTO("Barrett M90  ","United States","Metal",40000.00,Type.sniperRifle) );
		ref.add(new WeaponDTO("Barrett M95  ","United States","Metal",50000.00,Type.sniperRifle) );
		ref.add(new WeaponDTO("Barrett M98B  ","United States","Metal",60000.00,Type.sniperRifle) );
		ref.add(new WeaponDTO("Dragunov SUV  ","Russia","Metal",25000.00,Type.sniperRifle) );
		ref.add(new WeaponDTO("Modular Sniper Rifile  ","United States","Metal",80000.00,Type.sniperRifle) );

		ref.add(new WeaponDTO("ITKK 31 VKT  ","FINLAND","Aluminum",65000.00,Type.machineGun) );
		ref.add(new WeaponDTO("Bren Light machine Gun  ","United Kingdom","Steel",45000.00,Type.machineGun) );
		ref.add(new WeaponDTO("SKT 50MG  ","SINGAPORE","Metal",23000.00,Type.machineGun) );
		ref.add(new WeaponDTO("CKM WZ. 30  ","POLAND","Metal",33000.00,Type.machineGun) );
		ref.add(new WeaponDTO("DAEWOO K3  ","SOUTH kOREA","Metal",90000.00,Type.machineGun) );

		
		System.out.println("1 . Find and Print All Weapon By prize Grater Then 30000");
		System.out.println("------------------------------------------------------------");
		ref
		.stream()
		
		.filter(ref2->ref2.getPrize()>30000.00)
		.sorted((a1,a2)->Double.compare(a2.getPrize(),a1.getPrize()))
		.forEach(ref1->System.out.println(ref1));
		
		System.out.println("2 .Find and Print All Weapon made By And Made On");
		System.out.println("------------------------------------------------------------");
		
		ref
		.stream()
		.forEach(ref1-> System.out.println("Weapon Name : "+ref1.getName()+"---"+"Made By : "+ref1.getMadeBY()
		+"---"+"Made on : "+ref1.getMadeOn()));
		
		
		System.out.println("3 .Find and Print All Weapon  By Name Sorted in descinding order");
		System.out.println("------------------------------------------------------------");
		
		ref
		.stream()
		.sorted()
		.forEach(ref1->System.out.println(ref1));
		
		
		System.out.println("4 . Print All Weapon Sort by made by");
		System.out.println("------------------------------------------------------------");
		
		ref
		.stream()
		.sorted((a1,a2)->a1.getMadeBY().compareTo(a2.getMadeBY()))
		.forEach(ele->System.out.println(ele));
		
		System.out.println("5 . Print All Weapon Sort by made On");
		System.out.println("------------------------------------------------------------");
		
		ref
		.stream()
		.sorted((a1,a2)->a1.getMadeOn().compareTo(a2.getMadeOn()))
		.forEach(ele->System.out.println(ele));
		

		System.out.println("6 . Print All Weapon Sort by prize");
		System.out.println("------------------------------------------------------------");
	
		
		Comparator<WeaponDTO> comparator = (a1,a2)->Double.compare(a2.getPrize(),a1.getPrize());
		 ref
		.stream()
		.sorted(comparator).forEach(a->System.out.println(a.getPrize()));
		
		System.out.println("7 . Print All Weapon Sort by prize");
		System.out.println("------------------------------------------------------------");

		
				
	}

}
