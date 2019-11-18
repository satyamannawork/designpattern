package com.satya.dp.creational.adstractfactory;

public class NormalCircle implements Shape {

	public NormalCircle() {
		// TODO Auto-generated constructor stub
		System.out.println("Circle has been entered");
	} 
	@Override
	public Object getShape() {
		// TODO Auto-generated method stub
		
		return new NormalCircle();
	}

}
