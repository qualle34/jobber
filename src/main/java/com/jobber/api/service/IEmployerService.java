package com.jobber.api.service;

import com.jobber.entity.Employer;

import java.util.List;

public interface IEmployerService {

    List<Employer> getAll();

    void add(Employer employer);

    Employer getById(Integer id);

    void update(Employer employer);

    void delete(Employer employer);
}
