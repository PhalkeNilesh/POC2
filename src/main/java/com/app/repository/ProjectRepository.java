package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer>{
	
	
	
	public Project findById(int id);
	
	//public Project findByName(String firstName);

}
