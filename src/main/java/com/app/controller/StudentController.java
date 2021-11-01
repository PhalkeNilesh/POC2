package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
import com.app.repository.StudentRepository;


@RestController
public class StudentController {
	
	@Autowired
	StudentRepository studRepo;
	
//	@Autowired
	//ProjectRepository proRepo;
	
	@RequestMapping("/hello")
	public String hello() {
		List<Student> list=studRepo.findByName("Nilesh");
		list.forEach(e -> System.out.println(e));
		return "Hello User";
		
		
		
	}
	
	
//	@GetMapping("/getStudent")
//	public Optional<Student> gateByName(@PathVariable Integer id){
//		return studRepo.findById(id);
//	}
	
	

}
