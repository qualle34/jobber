package com.jobber.controller;

import com.jobber.service.UserService;
import com.jobber.service.security.SecurityUser;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import static com.jobber.controller.handler.AuthenticationUtil.retrieveAuthorities;
import static com.jobber.controller.handler.AuthenticationUtil.retrieveUserId;

@Controller
@RequiredArgsConstructor
public class ProfileController {

    private final UserService userService;

    @GetMapping("/profile")
    public String getProfilePage(Model model, @AuthenticationPrincipal SecurityUser auth) {
        model.addAttribute("authorities", retrieveAuthorities(auth));
        model.addAttribute("user", userService.getById(retrieveUserId(auth)));
        return "profile";
    }


}
