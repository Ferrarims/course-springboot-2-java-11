package com.ferrari.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ferrari.course.entites.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
