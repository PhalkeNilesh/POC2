package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.ERole;
import com.app.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	Optional<Role>findByName(ERole name);
}
