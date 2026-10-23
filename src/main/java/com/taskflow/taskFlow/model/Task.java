package com.taskflow.taskFlow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
@Table(name="tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false,length=150)
    private String title;
    @Column(length=500)
    private String description;
    @Column(nullable=false)
    private boolean completed=false;

    public Task(){

    }
    public Long getId(){return id;}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isCompleted() {return completed;}
    public void setCompleted(boolean completed){
        this.completed = completed;
    }

}
