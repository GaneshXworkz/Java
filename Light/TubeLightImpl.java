package com.xworkz.Abstract.Light;

public  class TubeLightImpl implements Switch {
	
	@Override
	public void sOn() {
		System.out.println("TubeLight is On.....");
	}
	
	@Override
	public void sOff() {
		System.out.println("Tublite is Off.....");
	}
	
}
