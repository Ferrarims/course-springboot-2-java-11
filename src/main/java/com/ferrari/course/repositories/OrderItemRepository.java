package com.ferrari.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ferrari.course.entites.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}
