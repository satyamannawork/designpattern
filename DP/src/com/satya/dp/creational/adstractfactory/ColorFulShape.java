package com.satya.dp.creational.adstractfactory;

public class ColorFulShape extends AbstractShape {

	@Override
	public Shape getShape(String name) {
		Shape shape = null ; 
		if(name.equalsIgnoreCase("circle")){
			shape  = new ColorFulCircle();
		}
		else if (name.equalsIgnoreCase("rectangle")){
			shape  = new ColorFulRectangle();
		}
		return  shape ; 
	}
}
