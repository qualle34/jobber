package com.jobber.dao;

import com.jobber.api.dao.IStatusDao;
import com.jobber.entity.Employer;
import com.jobber.entity.Status;
import com.jobber.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class StatusDao implements IStatusDao {

    @Autowired
    EntityManager entityManager;

    @Override
    public List<Status> getAll() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Status> cq = cb.createQuery(Status.class);
        Root<Status> rootEntry = cq.from(Status.class);
        CriteriaQuery<Status> all = cq.select(rootEntry);
        TypedQuery<Status> allQuery = entityManager.createQuery(all);
        return allQuery.getResultList();
    }

    @Override
    public void add(Status status) {
        entityManager.persist(status);
    }

    @Override
    public Status getById(Integer id) {
        return entityManager.find(Status.class, id);
    }

    @Override
    public void update(Status status) {
        entityManager.refresh(status);
    }

    @Override
    public void delete(Status status) {
        entityManager.detach(status);
    }
}
