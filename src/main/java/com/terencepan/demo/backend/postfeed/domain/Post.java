package com.terencepan.demo.backend.postfeed.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Post {

    @Id
    private String postId;
    private String postText;
    private String postLink;
    private List<Reply> replyList;
    private String postCategory;
    private User originalPoster;
}
