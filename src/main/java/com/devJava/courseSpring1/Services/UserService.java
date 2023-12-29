package com.devJava.courseSpring1.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devJava.courseSpring1.entites.User;
import com.devJava.courseSpring1.repositories.UserRepository;
@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	public List<User> findAll(){
		return userRepository.findAll();
	}
	public User findById(long id) {
		return  userRepository.findById(id).get();
	}
}
