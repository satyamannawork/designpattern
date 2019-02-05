package com.satya.dp.creational.adstractfactory;

public class Rectangle implements Shape {

	 public Rectangle() {
		// TODO Auto-generated constructor stub
			System.out.println("Rectangle has been entered");
	}
	@Override
	public Object getShape() {
		// TODO Auto-generated method stub
	
		return new Rectangle();
	}

}
