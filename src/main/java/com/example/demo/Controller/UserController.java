package com.example.demo.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.UserEntity;
import com.example.demo.Service.UserService;

@RestController
public class UserController {
	private UserService userService;
	
	@PostMapping("/User/add")
	public UserEntity saveToBD(@RequestBody UserEntity userEntity ) {
		return userService.addUserToBD(userEntity);
	}
	

}
