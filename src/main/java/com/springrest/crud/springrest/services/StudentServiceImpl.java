package com.springrest.crud.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.crud.springrest.dao.StudentDao;
import com.springrest.crud.springrest.entity.Student;


@Service
public class StudentServiceImpl implements StudentService{
	
	
	@Autowired 
	private StudentDao studentDao;
	
	
	public StudentServiceImpl(List<Student> list) {
		super();
//		list = new ArrayList<>();
//		list.add(new Student("a001", "Kashif", "Kolkata", "9090109906"));
		
//		System.out.println(list.get(0));
//		this.list = list;
	}
	
	@Override
	public List<Student> getStudents() {
		return studentDao.findAll();
	}

	@Override
	public Student getStudent(String studentId) {
		// TODO Auto-generated method stub
//		Student st = null;
//		
//		for(Student stOne:list) {
//			if(studentId.equals(stOne.getId())) {
//				st = stOne;
//				System.out.println(stOne.getId());
//			}
//
////			System.out.println(stOne.getId());
////
////			System.out.println(studentId);
//		}
		return studentDao.findById(studentId).get();
	}

	@Override
	public void deleteStudent(String studentId) {
		// TODO Auto-generated method stub
		studentDao.deleteById(studentId);
		
	}

	@Override
	public Student updateStudent (Student student) {
		// TODO Auto-generated method stub
		studentDao.save(student);
		return student;
	}

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		studentDao.save(student);
		return student;
	}

}
