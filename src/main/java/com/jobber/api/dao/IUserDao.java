package com.jobber.api.dao;

import com.jobber.entity.User;

import java.util.List;

public interface IUserDao {

    List<User> getAll();

    void add(User user);

    User getById(Integer id);

    void update(User user);

    void delete(User user);
}
