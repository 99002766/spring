package com.lts.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class ShapeFactor {
	@Autowired
	//@Qualifier("getTrianlge")
	Shape shape;
	//@Autowired
	//@Qualifier("triangle")
	Shape nshape;
	public void printArea(int x, int y) {
		System.out.println("print area");
		shape.calculateArea(x,y);
		//nshape.calculateArea(x,y);
	}
	

}
