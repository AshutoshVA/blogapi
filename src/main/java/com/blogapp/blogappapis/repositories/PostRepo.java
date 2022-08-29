package com.blogapp.blogappapis.repositories;

import com.blogapp.blogappapis.entities.Category;
import com.blogapp.blogappapis.entities.Post;
import com.blogapp.blogappapis.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface PostRepo extends JpaRepository<Post,Integer> {

    List<Post> findByUser(User user);

    List<Post> findByCategory(Category category);
}
