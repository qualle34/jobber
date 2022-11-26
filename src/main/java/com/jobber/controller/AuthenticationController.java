package com.jobber.controller;

import com.jobber.dto.RegistrationDto;
import com.jobber.service.UserService;
import com.jobber.service.security.SecurityUser;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import static com.jobber.controller.handler.AuthenticationUtil.retrieveAuthorities;

@Controller
@RequiredArgsConstructor
public class AuthenticationController {

    private final UserService userService;

    @GetMapping("/registration")
    public String getRegistrationPage(Model model, @AuthenticationPrincipal SecurityUser auth) {
        model.addAttribute("authorities", retrieveAuthorities(auth));
        return "registration";
    }

    @GetMapping("/login")
    public String getLoginPage(Model model, @AuthenticationPrincipal SecurityUser auth) {
        model.addAttribute("authorities", retrieveAuthorities(auth));
        return "login";
    }

    @PostMapping("/registration")
    void userRegistration(RegistrationDto dto) {
        userService.register(dto);
    }
}
