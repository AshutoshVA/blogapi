package com.blogapp.blogappapis.repositories;

import com.blogapp.blogappapis.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Integer> {
}
