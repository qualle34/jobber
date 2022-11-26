package com.jobber.service.impl;

import com.jobber.entity.Image;
import com.jobber.repository.ImageRepository;
import com.jobber.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ImageServiceImpl extends AbstractGenericService<Image, Long, ImageRepository> implements ImageService {

    private final ImageRepository repository;

    @Override
    protected ImageRepository repository() {
        return repository;
    }
}
