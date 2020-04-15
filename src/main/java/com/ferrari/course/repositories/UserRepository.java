package com.ferrari.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ferrari.course.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
