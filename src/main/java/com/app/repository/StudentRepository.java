package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	public List<Student>findByName(String firstName);
}
