package com.springrest.crud.springrest.services;

import java.util.List;

import com.springrest.crud.springrest.entity.Student;

public interface StudentService {
	
	public List<Student> getStudents();
	
	public Student getStudent(String studentId);
	

	public Student addStudent(Student student);
	
	public void deleteStudent(String studentId);
	

	public Student updateStudent(Student student);
}
