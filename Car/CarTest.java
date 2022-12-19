package com.Xworkz.Car;


public class CarTest {
	
	public static void main(String[] args) {
		
		Car car=new Car();
		car.setName("TATA");
		car.setCompanyAddress("Rajajinagra");
		car.setEntryFee(5000);
		car.setPhoneNo(98756213233L);
		car.setCompanygrade('A');
		car.setRupees(6000);
		car.setExpensiveCharge(5000);
		car.setCompanyid("1235DVGH");
		
		System.out.println(car);
		System.out.println(car.equals(car));
		System.out.println(car.hashCode());

		
		
	}
	
	

}
