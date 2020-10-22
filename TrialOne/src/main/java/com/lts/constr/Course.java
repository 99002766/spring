package com.lts.constr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Course {
	String name;
	Double price;
	public String getName() {
		return name;
	}
	@Value("${student.course.name}")
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	@Value("${student.course.price}")
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", price=" + price + "]";
	}
	
	

}
