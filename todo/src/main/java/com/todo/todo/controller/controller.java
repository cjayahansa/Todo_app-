package com.todo.todo.controller;

import com.todo.todo.model.Task;
import com.todo.todo.service.Taskservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;



@Controller
public class controller {
    @Autowired
    private final Taskservice taskservice;

    public controller(Taskservice taskservice) {
        this.taskservice = taskservice;
    }

    @GetMapping
    public String getAllTasks(Model model) {
        List<Task> tasks = taskservice.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }

    @PostMapping
    public String createTask(@RequestParam String title){
        taskservice.createTask(title);
        return"redirect:/";
    }
    @GetMapping("/{id}/delete")
    public String deleteTasks(@PathVariable Integer id) {
        taskservice.deleteTask(id);
        return"redirect:/";
    }
    @GetMapping("/{id}/toggle")
    public String toggleTasks(@PathVariable Integer id) {
        taskservice.toggleTask(id);
        return"redirect:/";
    }

}