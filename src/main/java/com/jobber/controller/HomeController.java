package com.jobber.controller;

import com.jobber.entity.Task;
import com.jobber.service.TaskService;
import com.jobber.service.security.SecurityUser;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import static com.jobber.controller.handler.AuthenticationUtil.retrieveAuthorities;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final TaskService taskService;

    @GetMapping("/")
    public String getMainPage(Model model, @AuthenticationPrincipal SecurityUser auth) {
        List<Task> taskList = taskService.getAll();
        model.addAttribute("authorities", retrieveAuthorities(auth));
        model.addAttribute("tasks", taskList);
        return "home";
    }

    @GetMapping("/about")
    public String getAboutPage(Model model) {
        return "redirect:/";
    }
}
