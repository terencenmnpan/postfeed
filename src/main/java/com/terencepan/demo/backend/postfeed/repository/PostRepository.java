package com.terencepan.demo.backend.postfeed.repository;

import com.terencepan.demo.backend.postfeed.domain.Post;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PostRepository extends PagingAndSortingRepository<Post, String> {

}
