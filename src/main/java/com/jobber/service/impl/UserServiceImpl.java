package com.jobber.service.impl;

import com.jobber.dto.RegistrationDto;
import com.jobber.entity.Credentials;
import com.jobber.entity.Role;
import com.jobber.entity.User;
import com.jobber.repository.UserRepository;
import com.jobber.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl extends AbstractGenericService<User, Long, UserRepository> implements UserService {

    private final UserRepository repository;
    private final PasswordEncoder encoder;

    @Override
    public User getUserByLogin(String login) {
        return repository.findUserByLogin(login);
    }

    @Override
    public void register(RegistrationDto dto) {
        Credentials credentials = new Credentials();
        credentials.setLogin(dto.getLogin());
        credentials.setPassword(encoder.encode(dto.getPassword()));

        Role role = new Role();
        role.setId(1L); // todo

        User user = new User();
        user.setFirstname(dto.getFirstname());
        user.setLastname(dto.getLastname());
        user.setLocation(dto.getLocation());
        user.setPhone(dto.getPhone());
        user.setEmail(dto.getEmail());

        credentials.setUser(user);
        role.setUsers(List.of(user));
        user.setCredentials(credentials);
        user.setRole(role);

        add(user);
    }

    @Override
    protected UserRepository repository() {
        return repository;
    }
}
