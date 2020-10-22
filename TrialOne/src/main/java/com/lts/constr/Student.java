package com.lts.constr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student {
	String name;
	String Id;
	String dept;
	Course course;
	@Autowired
	public Student(Course course) {
		super();
		this.course = course;
	}
	public String getName() {
		return name;
	}
	@Value("${student.name}")
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return Id;
	}
	@Value("${student.id}")
	public void setId(String id) {
		Id = id;
	}
	public String getDept() {
		return dept;
	}
	@Value("${student.dept}")
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", Id=" + Id + ", dept=" + dept + ", course=" + course + "]";
	}


}
