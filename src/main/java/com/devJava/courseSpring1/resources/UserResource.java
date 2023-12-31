package com.devJava.courseSpring1.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devJava.courseSpring1.Services.UserService;
import com.devJava.courseSpring1.entites.User;

@RestController	
@RequestMapping( "/users")
public class UserResource {
    @Autowired	
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
		list.stream().map(u -> u.getName()).forEach(System.out:: println);
	return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable long id) {	
		User u = service.findById(id);
		return ResponseEntity.ok().body(u);
	}
	}
