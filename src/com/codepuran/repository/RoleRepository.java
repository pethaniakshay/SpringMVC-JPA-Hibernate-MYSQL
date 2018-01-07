package com.codepuran.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codepuran.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}