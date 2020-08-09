package com.springboot.jpa.springbootjpa.service;

import com.springboot.jpa.springbootjpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
