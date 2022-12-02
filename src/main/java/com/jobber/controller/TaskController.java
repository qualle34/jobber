package com.jobber.controller;

import com.jobber.dto.CreateTaskDto;
import com.jobber.entity.Task;
import com.jobber.service.AreaService;
import com.jobber.service.TaskService;
import com.jobber.service.security.SecurityUser;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import static com.jobber.controller.handler.AuthenticationUtil.retrieveAuthorities;
import static com.jobber.controller.handler.AuthenticationUtil.retrieveUserId;

@Controller
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;
    private final AreaService areaService;

    @GetMapping("/task/create")
    public String getSendTaskPage(Model model, @AuthenticationPrincipal SecurityUser auth) {
        model.addAttribute("authorities", retrieveAuthorities(auth));
        model.addAttribute("areas", areaService.getAll());
        return "create_task";
    }

    @GetMapping("/task/{id}")
    public String getTaskPage(@PathVariable long id, Model model, @AuthenticationPrincipal SecurityUser auth) {
        Task task = taskService.getFullById(id);

        model.addAttribute("authorities", retrieveAuthorities(auth));
        model.addAttribute("task", task);
        return "task";
    }

    @PostMapping("/task/create")
    public String  createTask(@AuthenticationPrincipal SecurityUser auth, CreateTaskDto dto) {
        dto.setUserId(retrieveUserId(auth));
        taskService.create(dto);
        return "redirect:/";
    }
}
