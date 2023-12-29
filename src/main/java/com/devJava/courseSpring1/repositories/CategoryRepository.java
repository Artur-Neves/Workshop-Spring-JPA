package com.devJava.courseSpring1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devJava.courseSpring1.entites.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
