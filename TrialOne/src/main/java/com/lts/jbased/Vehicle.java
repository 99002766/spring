package com.lts.jbased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Vehicle {
	String vehicleName;
	int vehicleId;
	String brand;
	public String getVehicleName() {
		return vehicleName;
	}
	@Value("Car")
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	@Value("211")
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getBrand() {
		return brand;
	}
	@Value("KIA")
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleName=" + vehicleName + ", vehicleId=" + vehicleId + ", brand=" + brand + "]";
	}
	

}
