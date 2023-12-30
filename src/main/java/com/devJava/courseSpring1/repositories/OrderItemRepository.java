package com.devJava.courseSpring1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devJava.courseSpring1.entites.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
