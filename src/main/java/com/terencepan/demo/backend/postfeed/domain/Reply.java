package com.terencepan.demo.backend.postfeed.domain;

import org.springframework.data.annotation.Id;

public class Reply {
    @Id
    private String replyId;
    private User replier;
    private String replyComment;
}
