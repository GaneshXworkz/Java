package com.xworkz.Abstract.Manager;

public interface ShowRoomContract {
	
	public void getManager();
	public boolean added(Manager manager);
	public void getManagerByName(String name);
	public void getManagerByAge(int age);
	public void getManagerByAddress(String address);
	public void getManagerByGender(Gender gender);
	public void getManagerNamebyGender(Gender gender);
	public void getGenderByManagerName(String name);
	public boolean updateAdressByName(String name,String newaddress);
	public boolean updateNamebyAge(String name,int age);
	public boolean deleteByName(String name);
	public boolean deleteByAge(int age);
	public boolean deleteByGender(Gender gen);
	public void getnewManager();
	
}
