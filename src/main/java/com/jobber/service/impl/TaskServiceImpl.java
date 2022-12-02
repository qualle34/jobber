package com.jobber.service.impl;

import com.jobber.dto.CreateTaskDto;
import com.jobber.entity.*;
import com.jobber.repository.TaskRepository;
import com.jobber.service.TaskService;
import com.jobber.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl extends AbstractGenericService<Task, Long, TaskRepository> implements TaskService {

    private final TaskRepository repository;
    private final UserService userService;

    @Override
    protected TaskRepository repository() {
        return repository;
    }

    @Override
    public Task getFullById(long id) {
        return repository.getFullById(id);
    }

    @Override
    public void create(CreateTaskDto dto) {
        User user = userService.getFullById(dto.getUserId());

        Task task = new Task();

        user.getEmployer().setTaskSet(Set.of(task));
        task.setTitle(dto.getTitle());
        task.setDescription(dto.getDescription());
        task.setEmployer(user.getEmployer());
        task.setStatus(new Status(1L));
        task.setArea(new Area(dto.getAreaId()));
        task.setImage(new Image(1L));
        repository.save(task);
    }
}
