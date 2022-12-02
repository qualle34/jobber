package com.jobber;

import com.jobber.dto.RegistrationDto;
import com.jobber.entity.User;
import com.jobber.service.mapper.RegistrationMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class RegistrationTest {

    @Autowired
    RegistrationMapper registrationMapper;

    @Autowired
    PasswordEncoder encoder;

    @Test
    public void testWhenConvertDtoThanSuccess(){
        RegistrationDto dto = RegistrationDto.builder()
                .firstname("1")
                .lastname("2")
                .login("3")
                .location("4")
                .email("5")
                .phone("6")
                .password("7")
                .build();

        User user = registrationMapper.toEntity(dto);

        assertEquals("1", user.getFirstname());
        assertEquals("2", user.getLastname());
        assertEquals("3", user.getCredentials().getLogin());
        assertEquals("4", user.getLocation());
        assertEquals("5", user.getEmail());
        assertEquals("6", user.getPhone());
        assertTrue(encoder.matches("7", user.getCredentials().getPassword()));
    }
}
