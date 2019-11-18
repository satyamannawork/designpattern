package com.satya.dp.structural.adaptor;

public  class Adaptor  {

	SamsungCharger samsungCharger;
	AppleCharger applecharger ;
	Adaptor(){
		this.applecharger = new  Apple();
	}
	
	
	 public void getCharged() {
		 this.applecharger.getCharged();
	}

	

}
