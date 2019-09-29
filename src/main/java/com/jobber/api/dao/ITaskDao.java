package com.jobber.api.dao;

import com.jobber.entity.Task;

import java.util.List;

public interface ITaskDao {

    List<Task> getAll();

    void add(Task task);

    Task getById(Integer id);

    void update(Task task);

    void delete(Task task);
}
