package com.devJava.courseSpring1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devJava.courseSpring1.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
