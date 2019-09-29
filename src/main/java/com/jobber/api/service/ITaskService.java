package com.jobber.api.service;

import com.jobber.entity.Task;

import java.util.List;

public interface ITaskService {

    List<Task> getAll();

    void add(Task task);

    Task getById(Integer id);

    void update(Task task);

    void delete(Task task);
}
