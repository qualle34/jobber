package com.jobber.service;

import com.jobber.api.dao.IAreaDao;
import com.jobber.api.service.IAreaService;
import com.jobber.entity.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AreaService implements IAreaService {

    @Autowired
    IAreaDao areaDao;

    @Override
    public List<Area> getAll() {
        return areaDao.getAll();
    }

    @Override
    @Transactional
    public void add(Area area) {
        areaDao.add(area);
    }

    @Override
    public Area getById(Integer id) {
        return areaDao.getById(id);
    }

    @Override
    @Transactional
    public void update(Area area) {
        areaDao.update(area);
    }

    @Override
    @Transactional
    public void delete(Area area) {
        areaDao.delete(area);
    }
}
