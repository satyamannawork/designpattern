package com.satya.dp.creational.adstractfactory;

public class ColorFulShapeFactory extends  AbstractShape{

	@Override
	public Shape getShape(String name) {
		// TODO Auto-generated method stub
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
