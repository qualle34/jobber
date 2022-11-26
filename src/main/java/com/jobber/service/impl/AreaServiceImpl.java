package com.jobber.service.impl;

import com.jobber.entity.Area;
import com.jobber.repository.AreaRepository;
import com.jobber.service.AreaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AreaServiceImpl extends AbstractGenericService<Area, Long, AreaRepository> implements AreaService {

    private final AreaRepository repository;

    @Override
    protected AreaRepository repository() {
        return repository;
    }
}
