package com.satya.dp.creational.adstractfactory;

public class ColorFulRectangle implements Shape {
	public ColorFulRectangle() {
		// TODO Auto-generated constructor stub
		System.out.println("ColurFul Rectangle");
	}

	@Override
	public Object getShape() {
		// TODO Auto-generated method stub
		return new ColorFulRectangle();
	}
}
