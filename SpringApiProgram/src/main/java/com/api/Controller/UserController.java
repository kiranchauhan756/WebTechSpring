package com.api.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.User.User;
import com.api.service.UserServiceI;


@RestController
@RequestMapping("/user")
public class UserController {
	private UserServiceI userService;

	public UserController(UserServiceI userService) {
		this.userService = userService;
	}
	
	@PostMapping("/hello")
	public ResponseEntity<User> data( @RequestBody User user) {
		User user1 = userService.data(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
		
	}
}
