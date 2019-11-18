package com.satya.dp.creational.adstractfactory;

public class NormalRectangle implements Shape {

	 public NormalRectangle() {
		// TODO Auto-generated constructor stub
			System.out.println("Rectangle has been entered");
	}
	@Override
	public Object getShape() {
		// TODO Auto-generated method stub
	
		return new NormalRectangle();
	}

}
