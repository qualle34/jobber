package com.jobber.controller;

import com.jobber.api.service.*;
import com.jobber.entity.Area;
import com.jobber.entity.Employer;
import com.jobber.entity.Task;
import com.jobber.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    @Autowired
    IUserService userService;

    @Autowired
    IAreaService areaService;

    @Autowired
    IEmployerService employerService;

    @Autowired
    IStatusService statusService;

    @Autowired
    ITaskService taskService;

    @GetMapping("/")
    public String getMainPage(Model model) {
        List<Task> taskList = taskService.getAll();
        model.addAttribute("tasks", taskList);
        return "home";
    }

    @GetMapping("/profile")
    public String getProfilePage(Model model) {
        return "profile";
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
    public String getTaskPage(@PathVariable int id, Model model) {
        Task task = taskService.getById(id);
        Employer employer = task.getEmployer();

        model.addAttribute("title", task.getTitle());
        model.addAttribute("task_id", task.getId() + 1);
        model.addAttribute("area", task.getArea().getName());
        model.addAttribute("location", employer.getLocation());
        model.addAttribute("description", task.getDescription());
        model.addAttribute("empl_name", employer.getTitle());
        return "task";
    }

    @GetMapping("/registration")
    public String getRegistrationPage(Model model) {
        return "registration";
    }

    @GetMapping("/login")
    public String getLoginPage(Model model) {
        return "login";
    }

    @PostMapping("/registration")
    void userRegistration(@RequestParam Map<String, String> userData) {
        userService.add(new User(userData.get("firstname"), userData.get("lastname"), "", userData.get("password"), userData.get("phone"), userData.get("email")));
    }

    @PostMapping("/login")
    void userLogin(@RequestParam Map<String, String> userData) {
    }

    @PostMapping("/sendtask")
    void sendTask(@RequestParam Map<String, String> taskData) {
        Employer employer = employerService.getById(3);
        Area area = areaService.getById(3);
        taskService.add(new Task(taskData.get("title"), taskData.get("description"), employer, area));
    }
}
