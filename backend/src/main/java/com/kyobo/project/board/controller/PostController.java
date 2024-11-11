package com.kyobo.project.board.controller;

import com.kyobo.project.board.service.PostService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping("/api/v1/post")
public class PostController {
    @Autowired
    private PostService postService;
    //전체 게시글 조회(메인 화면)
    @GetMapping("/all")
    public void getPostAll {

    }

    //특정ID의 게시글 조회
    @GetMapping("/{postId}")
    public void getPost {

    }

    //특정ID의 게시글 삭제
    @DeleteMapping("/delete")
    public void delectPost {

    }

    // 글과 사진을 작성
    @PostMapping("/save")
    public void createPost{
    }
    // 게시글 수정
    @PutMapping("/update")
    public void updatePost{

    }
}