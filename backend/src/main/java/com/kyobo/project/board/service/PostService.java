package com.kyobo.project.board.service;

import com.kyobo.project.board.domain.Post;
import com.kyobo.project.board.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;


}