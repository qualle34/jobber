package com.jobber.repository;

import com.jobber.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    @Query("SELECT u FROM User u JOIN FETCH u.credentials c WHERE c.login LIKE :login")
    User findUserByLogin(String login);

    @Query("SELECT u FROM User u JOIN FETCH u.credentials JOIN FETCH u.employer WHERE u.id = :id")
    User getFullById(long id);
}
