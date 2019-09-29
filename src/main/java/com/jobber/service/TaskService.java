package com.jobber.service;

import com.jobber.api.dao.ITaskDao;
import com.jobber.api.service.ITaskService;
import com.jobber.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TaskService implements ITaskService {

    @Autowired
    ITaskDao taskDao;

    @Override
    public List<Task> getAll() {
        return taskDao.getAll();
    }

    @Override
    @Transactional
    public void add(Task task) {
        taskDao.add(task);
    }

    @Override
    public Task getById(Integer id) {
        return taskDao.getById(id);
    }

    @Override
    @Transactional
    public void update(Task task) {
        taskDao.update(task);
    }

    @Override
    @Transactional
    public void delete(Task task) {
        taskDao.delete(task);
    }
}
