package com.jobber.service.impl;

import com.jobber.entity.Task;
import com.jobber.repository.TaskRepository;
import com.jobber.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl extends AbstractGenericService<Task, Long, TaskRepository> implements TaskService {

    private final TaskRepository repository;

    @Override
    protected TaskRepository repository() {
        return repository;
    }
}
