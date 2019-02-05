package com.satya.dp.creational.adstractfactory;

public class FactoryAccess {

	public AbstractShape  getFactory(boolean flag){
		AbstractShape  abstrShape =null;
		if(flag) { 
			abstrShape =  new ColorFulShapeFactory();
		}
		else  {
			abstrShape =  new NormalShapeFactory();
		}
		return abstrShape;
	}
}
