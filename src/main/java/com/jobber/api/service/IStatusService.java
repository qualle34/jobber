package com.jobber.api.service;

import com.jobber.entity.Status;

import java.util.List;

public interface IStatusService {

    List<Status> getAll();

    void add(Status status);

    Status getById(Integer id);

    void update(Status status);

    void delete(Status status);
}
