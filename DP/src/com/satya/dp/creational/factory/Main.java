package com.satya.dp.creational.factory;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner  sc  = new Scanner(System.in);
		String input = sc.nextLine();
		ShapeBuilder  shapeBuilder =  new ShapeBuilder();
	
		Shape  shape=shapeBuilder.getShape(input);//
		shape.getShape();
		//	input.out.println("Rectangle has been entered");
		//System.out.println(shape.getShape(input).getClass());
			//;
		
		
	}
}
