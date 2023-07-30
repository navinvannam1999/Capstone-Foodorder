package com.order.food.service;

import java.util.List;

import com.order.food.dto.AdminDTO;
import com.order.food.entity.Admin;


public interface IAdminService {
	
    public String addAdmin(AdminDTO adminDto);
	
	public List<Admin> getAllAdmin();

}
