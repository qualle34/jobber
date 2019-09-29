package com.jobber.dao;

import com.jobber.api.dao.IAreaDao;
import com.jobber.entity.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class AreaDao implements IAreaDao {

    @Autowired
    EntityManager entityManager;

    @Override
    public List<Area> getAll() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Area> cq = cb.createQuery(Area.class);
        Root<Area> rootEntry = cq.from(Area.class);
        CriteriaQuery<Area> all = cq.select(rootEntry);
        TypedQuery<Area> allQuery = entityManager.createQuery(all);
        return allQuery.getResultList();
    }

    @Override
    public void add(Area area) {
        entityManager.persist(area);
    }

    @Override
    public Area getById(Integer id) {
        return entityManager.find(Area.class, id);
    }

    @Override
    public void update(Area area) {
        entityManager.refresh(area);
    }

    @Override
    public void delete(Area area) {
        entityManager.detach(area);
    }
}
