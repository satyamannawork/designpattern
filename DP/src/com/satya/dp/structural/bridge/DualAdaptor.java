package com.satya.dp.structural.bridge;

public class DualAdaptor extends  Adaptor {
	
	DualAdaptor(SamsungCharger samsungCharge, AppleCharger appleCharger) {
		super(samsungCharge, appleCharger);
		// TODO Auto-generated constructor stub
	}

	@Override
	void getCharged() {
		// TODO Auto-generated method stub
		super.samsungCharge.getCharged();
		super.appleCharger.getCharged();
		
	}

}
