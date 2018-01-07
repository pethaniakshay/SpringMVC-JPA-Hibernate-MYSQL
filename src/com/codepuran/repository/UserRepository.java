package com.codepuran.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codepuran.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}