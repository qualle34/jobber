package com.jobber.dao;

import com.jobber.api.dao.ITaskDao;
import com.jobber.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class TaskDao implements ITaskDao {

    @Autowired
    EntityManager entityManager;

    @Override
    public List<Task> getAll() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Task> cq = cb.createQuery(Task.class);
        Root<Task> rootEntry = cq.from(Task.class);
        CriteriaQuery<Task> all = cq.select(rootEntry);
        TypedQuery<Task> allQuery = entityManager.createQuery(all);
        return allQuery.getResultList();
    }

    @Override
    public void add(Task task) {
        entityManager.persist(task);
    }

    @Override
    public Task getById(Integer id) {
        return entityManager.find(Task.class, id);
    }

    @Override
    public void update(Task task) {
        entityManager.refresh(task);
    }

    @Override
    public void delete(Task task) {
        entityManager.detach(task);
    }
}
