package com.lts.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Employee {
	String Name;
	Integer Id;
	String Dept;
	@Autowired
	Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address=address;
	}
	public String setName() {
		return Name;
	}
	@Value("${employee.name}")
	public void setName(String name) {
		this.Name = name;
	}
	public Integer getId() {
		return Id;
	}
	@Value("${employee.id}")
	public void setId(Integer id) {
		this.Id = id;
	}
	public String getDept() {
		return Dept;
	}
	@Value("${employee.dept}")
	public void setDept(String dept) {
		this.Dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Id=" + Id + ", Dept=" + Dept + ", address=" + address + "]";
	}

	
	

}
