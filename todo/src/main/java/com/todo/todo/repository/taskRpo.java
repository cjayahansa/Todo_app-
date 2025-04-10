package com.todo.todo.repository;

import com.todo.todo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface taskRpo extends JpaRepository<Task, Integer> {

}
