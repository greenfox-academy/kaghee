package com.greenfox.error.model.controller;

import com.greenfox.error.model.service.UserService;
import com.greenfox.error.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by aze on 25/10/17.
 */
@Controller
public class AppController {

    @Autowired
    UserService service;

    @Autowired
    User user;

    @GetMapping("/main")
    public String index(Model model) {
        model.addAttribute("new_user", new User());
        model.addAttribute("yolo", service.getAll());
        return "/main";
    }

    @PostMapping("/app")
    public String create(@ModelAttribute User user) {
        this.user.setFirstName(user.getFirstName());
        this.user.setLastName(user.getLastName());
        service.save(user);
        return "redirect:/main";
    }
}