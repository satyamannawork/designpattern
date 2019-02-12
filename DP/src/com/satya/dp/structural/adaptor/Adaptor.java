package com.satya.dp.structural.adaptor;

public abstract class Adaptor  {

	SamsungCharger samsungCharger;
	AppleCharger applecharger ;
	Adaptor(AppleCharger applecharger){
		this.applecharger = applecharger;
	}
	
	
	abstract public void getCharged();

	

}
