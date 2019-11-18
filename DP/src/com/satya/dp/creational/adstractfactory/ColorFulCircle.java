package com.satya.dp.creational.adstractfactory;

public class ColorFulCircle implements Shape{
	public ColorFulCircle() {
		// TODO Auto-generated constructor stub
		System.out.println("Colorful circle has been called ");
	}

	@Override
	public Object getShape() {
		// TODO Auto-generated method stub
		return new ColorFulCircle();
	}
}
