package com.jobber.service;

import com.jobber.api.dao.IEmployerDao;
import com.jobber.api.service.IEmployerService;
import com.jobber.entity.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployerService implements IEmployerService {

    @Autowired
    IEmployerDao employerDao;

    @Override
    public List<Employer> getAll() {
        return employerDao.getAll();
    }

    @Override
    @Transactional
    public void add(Employer employer) {
        employerDao.add(employer);
    }

    @Override
    public Employer getById(Integer id) {
        return employerDao.getById(id);
    }

    @Override
    @Transactional
    public void update(Employer employer) {
        employerDao.update(employer);
    }

    @Override
    @Transactional
    public void delete(Employer employer) {
        employerDao.delete(employer);
    }
}
