package com.lts.carwiring;

import org.springframework.stereotype.Component;

@Component
public class Bike implements MileCal {

	@Override
	public void showMile(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Bike:"+x / y);
	}
}
