package com.ferrari.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ferrari.course.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
