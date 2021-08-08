package com.stacksimplify.restservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.stacksimplify.restservices.entities.User;
import com.stacksimplify.restservices.repositories.UserRepository;

// Service Class

@Service
public class UserService {

	// Auto wired the user repository
	@Autowired
	private UserRepository userRepository;

	// getAllUsers method
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	// createUser method
	public User createUser (User user) {
		return userRepository.save(user);
	}
	
	// getUserById method
	public Optional <User> getUserById (long id) {
		Optional<User> user = userRepository.findById(id);
		return user;
	}
	
	// Update user by Id
	public User updateUserById (long id, User user) {
		user.setId(id);
		return userRepository.save(user);
	}
	
	// delete User by Id
	public void deleteUserById (Long id) {
		userRepository.deleteById(id);
	}
	
	// Find By User name method
	public User getUserByUserName (String userName) {
		return userRepository.findByUserName(userName);
	}
}