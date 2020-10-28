package com.studentapp.service;

import java.util.List;

import com.studentapp.exception.StudentNotFoundException;
import com.studentapp.model.Student;

public interface StudentService {
Student addStudent(Student student);
Student getStudentById(Integer stdId) throws StudentNotFoundException;
List<Student> getAllStudents()throws StudentNotFoundException;
List<Student>getStudentByName(String name)throws StudentNotFoundException;
List<Student>getStudentByCity(String city)throws StudentNotFoundException;
List<Student>getStudentByDepartment(String department)throws StudentNotFoundException;
List<Student>findByAge(Integer age)throws StudentNotFoundException;

}
