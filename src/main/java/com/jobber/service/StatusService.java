package com.jobber.service;

import com.jobber.api.dao.IStatusDao;
import com.jobber.api.service.IStatusService;
import com.jobber.entity.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StatusService implements IStatusService {

    @Autowired
    IStatusDao statusDao;

    @Override
    public List<Status> getAll() {
        return statusDao.getAll();
    }

    @Override
    @Transactional
    public void add(Status status) {
        statusDao.add(status);
    }

    @Override
    public Status getById(Integer id) {
        return statusDao.getById(id);
    }

    @Override
    @Transactional
    public void update(Status status) {
        statusDao.update(status);
    }

    @Override
    @Transactional
    public void delete(Status status) {
        statusDao.delete(status);
    }
}
