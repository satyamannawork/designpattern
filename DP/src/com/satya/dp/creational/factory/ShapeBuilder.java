package com.satya.dp.creational.factory;

public  class ShapeBuilder {

	public Shape getShape(final String name){
		
		Shape ob = null;
		if(name.equalsIgnoreCase("circle")){
			
			ob= new Circle();
		}
		else if(name.equalsIgnoreCase("rectangle")){
			
			ob = new Rectangle();
		}
		return ob;
			
	}
}
