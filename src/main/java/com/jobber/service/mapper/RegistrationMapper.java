package com.jobber.service.mapper;

import com.jobber.dto.RegistrationDto;
import com.jobber.entity.Credentials;
import com.jobber.entity.Role;
import com.jobber.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RegistrationMapper {

    private final PasswordEncoder encoder;

    public User toEntity(RegistrationDto dto) {
            Credentials credentials = new Credentials();
            credentials.setLogin(dto.getLogin());
            credentials.setPassword(encoder.encode(dto.getPassword()));

            Role role = new Role();
            role.setId(1L);

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

            return user;
    }
}
