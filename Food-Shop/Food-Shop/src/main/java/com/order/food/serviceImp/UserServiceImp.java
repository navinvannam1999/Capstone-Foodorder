package com.order.food.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.food.dto.UserDTO;
import com.order.food.entity.User;
import com.order.food.repository.UserRepository;
import com.order.food.service.IUserService;

@Service
public class UserServiceImp implements IUserService {
	
	@Autowired
	private UserRepository repo;
	
	@Override
    public String addUser(UserDTO userDto) {
		User user = new User();
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setPhone(userDto.getPhone());
		
		repo.save(user);
		return "New User Registered";

	}
	
	@Override
	public List<User> getAllUser(){
		return repo.findAll();
	}

	@Override
	public String updateUser(UserDTO userDto) {
		User userUpdate = new User();
		userUpdate.setId(userDto.getId());
		userUpdate.setName(userDto.getName());
		userUpdate.setEmail(userDto.getEmail());
		userUpdate.setPassword(userDto.getPassword());
		userUpdate.setPhone(userDto.getPhone());
		
		repo.save(userUpdate);
		return "User Updated Successfully";
	}
	
	@Override
	public User getUserById(long id) {
		return repo.findById(id).get();
	}
	
	@Override
	public String deleteUser(long id) {
		repo.deleteById(id);
		return "User Deleted";
	}

}
