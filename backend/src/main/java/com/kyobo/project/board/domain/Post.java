package com.kyobo.project.board.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;
    private String postTitle;
    private String postContent;

}
