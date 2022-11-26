package com.jobber.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationDto {

    private String login;
    private String firstname;
    private String lastname;
    private String location;
    private String phone;
    private String email;
    private String password;
}
