package com.store.startlight_store.controller.api;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.store.startlight_store.entities.User;
import com.store.startlight_store.service.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class UserRestController {

	@Autowired
	private UserService userService;

	// lay ra 1 cai list
	@GetMapping
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> users = userService.getUsers();
		return new ResponseEntity<>(users, HttpStatus.OK);
	}

	// lay ra 1 object
	@GetMapping({ "/{userId}" })
	// pathvariable(dau /) giong request param(dau ?) @GetMapping({"/{userDetail}"})
	// public ResponseEntity<User> getUser((@RequestParam(name = "id", required =
	// false,defaultValue = "1") Long id)
	// http://localhost:8080/api/v1/user/userDetail?id=5
	public ResponseEntity<User> getUser(@PathVariable Long userId) {
		return new ResponseEntity<>(userService.findUserById(userId), HttpStatus.OK);
	}

	// Them bang restAPI ResponseEntity tra ve kieu JSON @RequestBody doc du lieu
	// dang JSON trong body gui len tra ve 1 object user tu dong
	@PostMapping
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		User User1 = userService.addUser(user);
		// tao moi nen dung HttpStatus.CREATED tao moi 201, get 200
		HttpHeaders httpHeaders = new HttpHeaders();// tra ve header trong JSON
		httpHeaders.add("currentTime", new Date().toString());
		return new ResponseEntity<>(User1, httpHeaders, HttpStatus.CREATED);
	}

	// Chuc nang update
	@PutMapping({ "/{userId}" })
	public ResponseEntity<User> updateUser(@PathVariable("userId") Long userId, @RequestBody User user) {
		userService.updateUser(userId, user);
		return new ResponseEntity<>(userService.findUserById(userId), HttpStatus.OK);
	}

	@DeleteMapping({ "/{userId}" })
	public ResponseEntity<User> deleteUser(@PathVariable("userId") Long userId) {
		userService.deleteUser(userId);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
