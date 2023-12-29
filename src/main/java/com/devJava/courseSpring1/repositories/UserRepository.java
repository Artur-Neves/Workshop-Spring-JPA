package com.devJava.courseSpring1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devJava.courseSpring1.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
