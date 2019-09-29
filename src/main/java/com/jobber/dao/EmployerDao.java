package com.jobber.dao;

import com.jobber.api.dao.IEmployerDao;
import com.jobber.entity.Area;
import com.jobber.entity.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class EmployerDao implements IEmployerDao {

    @Autowired
    EntityManager entityManager;

    @Override
    public List<Employer> getAll() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Employer> cq = cb.createQuery(Employer.class);
        Root<Employer> rootEntry = cq.from(Employer.class);
        CriteriaQuery<Employer> all = cq.select(rootEntry);
        TypedQuery<Employer> allQuery = entityManager.createQuery(all);
        return allQuery.getResultList();
    }

    @Override
    public void add(Employer employer) {
        entityManager.persist(employer);
    }

    @Override
    public Employer getById(Integer id) {
        return entityManager.find(Employer.class, id);
    }

    @Override
    public void update(Employer employer) {
        entityManager.refresh(employer);
    }

    @Override
    public void delete(Employer employer) {
        entityManager.detach(employer);
    }
}
