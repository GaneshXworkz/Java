package com.xworkz.Abstract.Interface.MultipalInhertance;

public class Employee extends Company implements Developer ,Tester {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("To Testing");
	}

	@Override
	public void develop() {
		// TODO Auto-generated method stub
		System.out.println("To developing");
	}

	
}
