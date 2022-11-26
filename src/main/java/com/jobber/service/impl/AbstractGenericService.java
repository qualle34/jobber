package com.jobber.service.impl;

import com.jobber.service.GenericService;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractGenericService<T, ID, R extends CrudRepository<T, ID>> implements GenericService<T, ID> {

    @Override
    public List<T> getAll() {
        List<T> t = new ArrayList<>();
        repository().findAll().forEach(t::add);
        return t;
    }

    @Override
    public T getById(ID id) {
        return repository().findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public void add(T t) {
        repository().save(t);
    }

    @Override
    public void update(T t) {
        repository().save(t);
    }

    @Override
    public void delete(ID id) {
        repository().deleteById(id);
    }

    protected abstract R repository();
}