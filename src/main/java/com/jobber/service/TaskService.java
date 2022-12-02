package com.jobber.service;

import com.jobber.dto.CreateTaskDto;
import com.jobber.entity.Task;

public interface TaskService extends GenericService<Task, Long> {

    Task getFullById(long id);

    void create(CreateTaskDto dto);
}
