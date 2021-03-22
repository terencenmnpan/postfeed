package com.terencepan.demo.backend.postfeed.repository;

import com.terencepan.demo.backend.postfeed.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, String> {
}
