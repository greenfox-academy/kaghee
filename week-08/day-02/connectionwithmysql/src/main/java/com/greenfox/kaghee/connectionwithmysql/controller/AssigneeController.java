package com.greenfox.kaghee.connectionwithmysql.controller;

import com.greenfox.kaghee.connectionwithmysql.model.Assignee;
import com.greenfox.kaghee.connectionwithmysql.model.Todo;
import com.greenfox.kaghee.connectionwithmysql.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value="/todo/assignee")
public class AssigneeController {

    @Autowired
    AssigneeRepository assigneeRepository;

    @GetMapping(value={"/", ""})
    public String listAssignees(Model model) {
        model.addAttribute("assignees", assigneeRepository.findAll());
        return "assignees";
    }

    @RequestMapping(value="/add")
    public String addAssignee(Model model) {
        model.addAttribute("assignee", new Assignee());
        return "createAssignee";
    }

    @PostMapping(value="/add")
    public String saveAssignee(@ModelAttribute Assignee assignee) {
        assigneeRepository.save(assignee);
        return "redirect:/todo/assignee";
    }
}