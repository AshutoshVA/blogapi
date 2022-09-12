package com.blogapp.blogappapis.services.impl;

import com.blogapp.blogappapis.entities.Comment;
import com.blogapp.blogappapis.entities.Post;
import com.blogapp.blogappapis.exceptions.ResourceNotFoundException;
import com.blogapp.blogappapis.payloads.CommentDto;
import com.blogapp.blogappapis.repositories.CommentRepo;
import com.blogapp.blogappapis.repositories.PostRepo;
import com.blogapp.blogappapis.services.CommentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private PostRepo postRepo;

    @Autowired
    private CommentRepo commentRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CommentDto createComment(CommentDto commentDto, Integer postId) {
        Post post = this.postRepo.findById(postId).orElseThrow(() ->
                new ResourceNotFoundException("post", "post id", postId));
        Comment comment = this.modelMapper.map(commentDto, Comment.class);
        comment.setPost(post);
        Comment savedComment = this.commentRepo.save(comment);

        return this.modelMapper.map(savedComment, CommentDto.class);
    }

    @Override
    public void deleteComment(Integer commentId) {
        Comment com = this.commentRepo.findById(commentId).orElseThrow(() ->
                new ResourceNotFoundException("Commen", "CommentId", commentId));

        this.commentRepo.delete(com);

    }
}
