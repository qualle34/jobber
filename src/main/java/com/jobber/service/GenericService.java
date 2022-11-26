package com.jobber.service;

import java.util.List;

public interface GenericService<T, ID> {

    List<T> getAll();

    T getById(ID id);

    void add(T t);

    void update(T t);

    void delete(ID id);
}
