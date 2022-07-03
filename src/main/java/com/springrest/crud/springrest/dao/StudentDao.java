package com.springrest.crud.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.crud.springrest.entity.Student;

public interface StudentDao extends JpaRepository<Student , String> {
	
}
