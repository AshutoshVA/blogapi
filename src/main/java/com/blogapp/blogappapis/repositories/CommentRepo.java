package com.blogapp.blogappapis.repositories;

import com.blogapp.blogappapis.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment, Integer> {
}
