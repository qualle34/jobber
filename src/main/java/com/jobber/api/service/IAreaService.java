package com.jobber.api.service;

import com.jobber.entity.Area;

import java.util.List;

public interface IAreaService {

    List<Area> getAll();

    void add(Area area);

    Area getById(Integer id);

    void update(Area area);

    void delete(Area area);
}
