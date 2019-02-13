package com.satya.dp.structural.bridge;

public abstract class Adaptor  {

	SamsungCharger samsungCharge ; 
	AppleCharger appleCharger ; 
	
	Adaptor(SamsungCharger samsungCharge,AppleCharger appleCharger) {
		this.samsungCharge   =  samsungCharge ; 
		this.appleCharger = appleCharger ; 
	}
	
	abstract  void  getCharged();
	

}
