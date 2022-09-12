package com.blogapp.blogappapis.services;

import com.blogapp.blogappapis.payloads.CommentDto;

public interface CommentService {

    CommentDto createComment(CommentDto commentDto,Integer postId);
    void deleteComment(Integer commentId);
}
