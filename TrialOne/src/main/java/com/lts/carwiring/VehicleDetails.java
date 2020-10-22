package com.lts.carwiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleDetails {
	@Autowired
	@Qualifier("car")
	MileCal car;
	@Autowired
	@Qualifier("bike")
	MileCal bike;
	String choice="car";
	public void getMilegae(int x, int y) {
		if(choice=="car") {
			car.showMile(x, y);
		}
		else
		{
			bike.showMile(x, y);
		}
	}
	

}
