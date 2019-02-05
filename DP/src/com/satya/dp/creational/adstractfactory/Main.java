package com.satya.dp.creational.adstractfactory;

public class Main {
	
	public static void main(String[] args) {
	
		FactoryAccess  factoryAccess  =  new FactoryAccess();
		AbstractShape  colorFulShape=  factoryAccess.getFactory(true);
		colorFulShape.getShape("circle");
		AbstractShape  normalShape=  factoryAccess.getFactory(false);
		normalShape.getShape("circle");
		
		
	}
}
