package com.lts.autowiring;

import org.springframework.stereotype.Component;

//@Component
public class Rectangle implements Shape{

	@Override
	public void calculateArea(int x, int y) {
		System.out.println("rect"+x*y);
	}

	
}
