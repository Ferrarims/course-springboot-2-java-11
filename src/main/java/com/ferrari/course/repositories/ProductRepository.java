package com.ferrari.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ferrari.course.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
