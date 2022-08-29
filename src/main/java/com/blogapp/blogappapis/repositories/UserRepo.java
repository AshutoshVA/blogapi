package com.blogapp.blogappapis.repositories;

import com.blogapp.blogappapis.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

}
