package org.example.entity;

import java.util.Objects;

public class Task {
    private String assignee;
    private String description;
    private Priority priority;
    private String project;
    private Status status;

    public Task(String project, String description, String assignee, Status status, Priority priority) {
        this.project = project;
        this.description = description;
        this.assignee = assignee;
        this.status = status;
        this.priority = priority;
    }

    public String getAssignee() {
        return assignee;
    }

    public String getDescription() {
        return description;
    }

    public Priority getPriority() {
        return priority;
    }

    public String getProject() {
        return project;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return project.equals(task.project) && description.equals(task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(project, description);
    }

}
