package com.satya.dp.creational.adstractfactory;

public class Circle implements Shape {

	public Circle() {
		// TODO Auto-generated constructor stub
		System.out.println("Circle has been entered");
	} 
	@Override
	public Object getShape() {
		// TODO Auto-generated method stub
		
		return new Circle();
	}

}
