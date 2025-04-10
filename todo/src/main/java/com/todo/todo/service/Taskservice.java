package com.todo.todo.service;

import com.todo.todo.model.Task;
import com.todo.todo.repository.taskRpo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Taskservice {

    private final taskRpo taskRepository;

    public Taskservice(taskRpo taskRepository) {
        this.taskRepository = taskRepository;
    }
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public void createTask(String title) {

        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        taskRepository.save(task);
    }

    public void deleteTask(Integer id) {
        taskRepository.deleteById(id);
    }

    public void toggleTask(Integer id) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
        task.setCompleted(!task.isCompleted());
        taskRepository.save(task);
    }
}
