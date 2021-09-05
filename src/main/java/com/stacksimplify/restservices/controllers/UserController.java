package com.stacksimplify.restservices.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stacksimplify.restservices.entities.User;
import com.stacksimplify.restservices.services.UserService;

// Controller class - updating lines to test commit

@RestController
public class UserController {

	// Auto wired the user service
	@Autowired
	private UserService userService;

	// getAllUsers method
	@GetMapping("/users")
	public List<User> getAllUsers() {

		return userService.getAllUsers();
	}

	// create User Method
	// @RequestBody Annotation
	// @PostMapping Annotation
	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}

	// getUserById method
	@GetMapping("/users/{id}")
	public Optional<User> getUserById(@PathVariable("id") long id) {
		return userService.getUserById(id);
	}

	// update User by Id method
	@PutMapping("/users/{id}")
	public User updateUserById(@PathVariable("id") long id, @RequestBody User user) {
		return userService.updateUserById(id, user);
	}
	
	// delete User by Id method
	@DeleteMapping("/users/{id}")
	public void deleteUserById (@PathVariable("id") Long id) {
		userService.deleteUserById(id); 
	}
	
	// get user by user name
	@GetMapping("/users/byusername/{username}")
	public User getUserByUserName (@PathVariable("username") String userName) {
		return userService.getUserByUserName(userName);
	}
}