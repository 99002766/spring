package com.studentapp.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.studentapp.exception.StudentNotFoundException;
import com.studentapp.model.Student;

@Repository
public interface StudentRepository extends MongoRepository{
	List<Student>findByAge(Integer age);
	Student getStudentById(Integer stdId) throws StudentNotFoundException;
	List<Student> getAllStudents()throws StudentNotFoundException;
	List<Student>getByName(String name)throws StudentNotFoundException;
	List<Student>getStudentByCity(String city)throws StudentNotFoundException;
	List<Student>getStudentByDepartment(String department)throws StudentNotFoundException;
	Student save(Student student);
	Student findById(Integer stdId);
	List<Student> findAll();


}