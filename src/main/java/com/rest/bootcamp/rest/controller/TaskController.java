package com.connect.connect2.controller;

import com.connect.connect2.model.Task;
import com.connect.connect2.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/task")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("/all")
    public @ResponseBody Iterable<Task> getAllTasks()
    {
        return  taskRepository.findAll();
    }
}
