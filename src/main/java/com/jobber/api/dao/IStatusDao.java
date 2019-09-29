package com.jobber.api.dao;

import com.jobber.entity.Status;

import java.util.List;

public interface IStatusDao {

    List<Status> getAll();

    void add(Status status);

    Status getById(Integer integer);

    void update(Status status);

    void delete(Status status);
}
