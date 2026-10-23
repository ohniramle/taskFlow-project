package com.taskflow.taskFlow.config;

import com.taskflow.taskFlow.model.Task;
import com.taskflow.taskFlow.repository.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initializeTasks(TaskRepository taskRepository){
        return args -> {
            if(taskRepository.count()==0){
                Task task = new Task();
                task.setTitle("Learn Spring Boot");
                task.setDescription("My first task with JPA");
                task.setCompleted(false);
                taskRepository.save(task);
                System.out.println("Task with title 'Learn Spring Boot' has been created");
            }
        };
    }
}
