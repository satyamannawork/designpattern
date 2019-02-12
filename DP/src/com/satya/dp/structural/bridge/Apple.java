package com.satya.dp.structural.bridge;

public class Apple implements AppleCharger {

	@Override
	public void  getCharged(){
		System.out.println("Apple is being charged");
	}
	
}
