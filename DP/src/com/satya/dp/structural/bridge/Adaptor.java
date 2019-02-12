package com.satya.dp.structural.bridge;

public class Adaptor implements SamsungCharger {

	AppleCharger applecharger ;
	Adaptor(AppleCharger applecharger){
		this.applecharger = applecharger;
	}
	
	@Override
	public void getCharged() {
		this.applecharger.getCharged();
		
	}

	

}
