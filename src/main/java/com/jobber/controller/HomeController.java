package com.jobber.controller;

import com.jobber.entity.Employer;
import com.jobber.entity.Task;
import com.jobber.entity.User;
import com.jobber.service.*;
import com.jobber.service.security.SecurityUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

import static com.jobber.controller.handler.AuthenticationUtil.retrieveAuthorities;

@Controller
public class HomeController {

    @Autowired
    UserService userService;

    @Autowired
    AreaService areaService;

    @Autowired
    TaskService taskService;

    @GetMapping("/")
    public String getMainPage(Model model, @AuthenticationPrincipal SecurityUser auth) {
        List<Task> taskList = taskService.getAll();
        model.addAttribute("authorities", retrieveAuthorities(auth));
        model.addAttribute("tasks", taskList);
        return "home";
    }

    @GetMapping("/about")
    public String getAboutPage(Model model) {
        return "about";
    }

    @GetMapping("/sendtask")
    public String getSendTaskPage() {
        return "send_task";
    }

    @PreAuthorize("ROLE_USER")
    @GetMapping("/task/{id}")
    public String getTaskPage(@PathVariable long id, Model model) {
        Task task = taskService.getById(id);
        Employer employer = task.getEmployer();
        User user = employer.getUser();

        model.addAttribute("title", task.getTitle());
        model.addAttribute("task_id", task.getId() + 1);
        model.addAttribute("area", task.getArea().getName());
        model.addAttribute("location", user.getLocation());
        model.addAttribute("description", task.getDescription());
        model.addAttribute("empl_name", employer.getTitle());
        return "task";
    }

    @PostMapping("/sendtask")
    void sendTask(@RequestParam Map<String, String> taskData) {
//        Employer employer = employerService.getById(3);
//        Area area = areaService.getById(3);
//        taskService.add(new Task(taskData.get("title"), taskData.get("description"), employer, area));
    }
}
