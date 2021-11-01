package com.app.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
import com.app.repository.ProjectRepository;
import com.app.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	StudentRepository studRepo;

	@Autowired
	ProjectRepository proRepo;

	@RequestMapping("/hello")
	public String hello() {
		return "Hello User";
	}

	@PostMapping("/insert")
	public Student insertStudent(@RequestBody Student student) {
		return studRepo.save(student);
	}

	@GetMapping("/getStudent")
	public List<Student> getAllStudent() {
		List<Student> student = new ArrayList<>();
		studRepo.findAll().forEach(student1 -> student.add(student1));
		return student;
	}

	@GetMapping("/getstudent/{id}")
	public Student findByStudentId(@Valid @PathVariable int id) {
		return studRepo.findById(id).get();
	}

}
