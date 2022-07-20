package com.api.controller;

import com.api.actions.ActionUser;
import com.api.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private ActionUser actionUser;
	
	@PostMapping("/signup")
	public ResponseEntity<User> newUser(@RequestBody User user){
		return new ResponseEntity<User>(actionUser.newUser(user), HttpStatus.CREATED);
	}
	
	@PostMapping("/signin")
	public ResponseEntity<User> getUserByUsernameAndPassword(@RequestBody User user){
		return new ResponseEntity<User>(actionUser.getUserByUsernameAndPassword(user), HttpStatus.CREATED);
	}
	
	@PostMapping("/checkusername")
	public ResponseEntity<Boolean> checkUsername(@RequestBody User user){
		return new ResponseEntity<Boolean>(actionUser.checkUsername(user), HttpStatus.CREATED);
	}
	
	@PostMapping("/checkemail")
	public ResponseEntity<Boolean> checkEmail(@RequestBody User user){
		return new ResponseEntity<Boolean>(actionUser.checkEmail(user), HttpStatus.CREATED);
	}
	
}
