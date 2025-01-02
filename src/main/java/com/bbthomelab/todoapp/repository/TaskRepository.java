package com.bbthomelab.todoapp.repository;

import com.bbthomelab.todoapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
