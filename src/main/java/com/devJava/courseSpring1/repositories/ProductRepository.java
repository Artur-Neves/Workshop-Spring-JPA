package com.devJava.courseSpring1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devJava.courseSpring1.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
