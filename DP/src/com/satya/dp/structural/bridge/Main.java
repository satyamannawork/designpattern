package com.satya.dp.structural.bridge;

public class Main {
	  public static void main(String[] args) {
		DualAdaptor da = new DualAdaptor(new Samsung(), new Apple());
		da.getCharged();
	}
}
