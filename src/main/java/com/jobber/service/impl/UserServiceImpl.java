package com.jobber.service.impl;

import com.jobber.dto.RegistrationDto;
import com.jobber.entity.User;
import com.jobber.repository.UserRepository;
import com.jobber.service.UserService;
import com.jobber.service.mapper.RegistrationMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl extends AbstractGenericService<User, Long, UserRepository> implements UserService {

    private final UserRepository repository;
    private final RegistrationMapper mapper;

    @Override
    public User getUserByLogin(String login) {
        return repository.findUserByLogin(login);
    }

    @Override
    public User getFullById(long id) {
        return repository.getFullById(id);
    }

    @Override
    public void register(RegistrationDto dto) {
        add(mapper.toEntity(dto));
    }

    @Override
    protected UserRepository repository() {
        return repository;
    }
}
