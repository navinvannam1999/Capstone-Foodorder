package com.order.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.food.dto.UserDTO;
import com.order.food.entity.User;
import com.order.food.service.IUserService;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService service;
		
		@PostMapping("/add-user")
	    public String addUser(@RequestBody UserDTO dto) {
			return service.addUser(dto);
		}
		
		@GetMapping("/getAll")
		public List<User> getAllUser(){
			return service.getAllUser();
		}
		
		@PutMapping("/updateUser")
		public String updateUser(@RequestBody UserDTO dto) {
			return service.updateUser(dto);
		}
		
		@GetMapping("get-user/{id}")
		public User getUserById(@PathVariable long id) {
			return service.getUserById(id);
		}
		
		@DeleteMapping("/deleteUser/{id}")
		public String deleteUser(@PathVariable long id) {
			return service.deleteUser(id);
		}

}
