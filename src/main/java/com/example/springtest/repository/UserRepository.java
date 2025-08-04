package com.example.springtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springtest.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);
}
