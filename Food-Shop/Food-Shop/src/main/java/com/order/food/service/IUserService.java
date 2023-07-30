package com.order.food.service;

import java.util.List;

import com.order.food.dto.UserDTO;
import com.order.food.entity.User;


public interface IUserService {
	
    public String addUser(UserDTO userDto);
	
	public List<User> getAllUser();
	
	public String updateUser(UserDTO userDto);
	
	public User getUserById(long id);
	
	public String deleteUser(long id);

}
