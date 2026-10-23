package com.taskflow.taskFlow.repository;
import com.taskflow.taskFlow.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TaskRepository extends JpaRepository<Task,Long>{

}
