package com.order.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.order.food.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
