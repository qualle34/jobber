package com.jobber.api.dao;

import com.jobber.entity.Area;

import java.util.List;

public interface IAreaDao {

    List<Area> getAll();

    void add(Area area);

    Area getById(Integer id);

    void update(Area area);

    void delete(Area area);

}
