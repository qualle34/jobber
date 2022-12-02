package com.jobber.repository;

import com.jobber.entity.Task;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {

    @Query("SELECT t FROM Task AS t JOIN FETCH t.employer AS e JOIN FETCH e.user JOIN FETCH t.area JOIN FETCH t.status JOIN FETCH t.image WHERE t.id = :id")
    Task getFullById(long id);
}
