package com.springrest.crud.springrest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.crud.springrest.dao.StudentDao;
import com.springrest.crud.springrest.entity.Student;
import com.springrest.crud.springrest.services.StudentService;

@RestController
public class MyController {

	@Autowired
	private StudentService studentService;


	@GetMapping("/test")
	public String home() {
		return "This is Test API";
	}


	@GetMapping("/students")
	public List<Student> getStudents(){
		return this.studentService.getStudents();
	}


	@GetMapping("/student/{studentId}")
	public Student getStudents(@PathVariable String studentId){
		return this.studentService.getStudent(studentId);
	}


	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student){
		return this.studentService.addStudent(student);
	}


	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student student){
		return this.studentService.updateStudent(student);
	}


	@DeleteMapping("/student/{studentId}")
	public Student deleteStudent(@PathVariable String studentId){
		this.studentService.deleteStudent(studentId);

		return null;
	}

}
