package com.taskflow.taskFlow.service;
import com.taskflow.taskFlow.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class taskService {
    private final TaskRepository taskRepository;
    public taskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
}
