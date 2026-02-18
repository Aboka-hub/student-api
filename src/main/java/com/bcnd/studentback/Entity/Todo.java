package com.bcnd.studentback.Entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Todo {

    private Long id;

    @NotBlank(message = "Name must not be blank")
    private String title;

    private boolean completed;

    public Todo(){};

    public Todo(Long id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
