package com.devJava.courseSpring1.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devJava.courseSpring1.entites.User;

@RestController	
@RequestMapping( "/users")
public class UserResource {
	@GetMapping
	public ResponseEntity<User> findAll() {
	return ResponseEntity.ok().body(new User(1, "name", "artur.diamante@gmail.com","73988180562", "123"));
	}
	}
