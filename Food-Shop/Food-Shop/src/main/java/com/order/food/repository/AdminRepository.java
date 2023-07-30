package com.order.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.food.entity.Admin;


public interface AdminRepository extends JpaRepository<Admin, Long> {

}
