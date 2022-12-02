package com.jobber.controller;

import com.jobber.service.TaskService;
import com.jobber.service.UserService;
import com.jobber.service.security.SecurityUser;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static com.jobber.controller.handler.AuthenticationUtil.retrieveAuthorities;

@Controller
@RequiredArgsConstructor
public class AdminController {

    private final UserService userService;
    private final TaskService taskService;

    @GetMapping("/admin")
    public String getAdminPage(@RequestParam(required = false) Integer page, Model model, @AuthenticationPrincipal SecurityUser auth) {

        model.addAttribute("authorities", retrieveAuthorities(auth));
        model.addAttribute("type", "");

        return "admin";
    }


    @GetMapping("/admin/users")
    public String getUsersPage(@RequestParam(required = false) Integer page, Model model, @AuthenticationPrincipal SecurityUser auth) {

        model.addAttribute("authorities", retrieveAuthorities(auth));
        model.addAttribute("type", "users");
        model.addAttribute("users", userService.getAll());

        return "admin";
    }

    @GetMapping("/admin/tasks")
    public String getTasksPage(@RequestParam(required = false) Integer page, Model model, @AuthenticationPrincipal SecurityUser auth) {

        model.addAttribute("authorities", retrieveAuthorities(auth));
        model.addAttribute("type", "tasks");
        model.addAttribute("tasks", taskService.getAll());

        return "admin";
    }
}
