package com.dmitrydunai;

public class Task {
    private String taskName;
    private boolean taskStatus;
    private int taskId;

    public Task(String taskName, boolean taskBooleanStatus, int taskId) {
        this.taskName = taskName;
        this.taskStatus = taskBooleanStatus;
        this.taskId = taskId;
    }

    public void setTaskStatus(boolean taskBooleanStatus) {
        this.taskStatus = taskBooleanStatus;
    }

    public boolean isTaskStatus() {
        return taskStatus;
    }

    public void addTask(Task task) {
        task.addTask(task);
    }

    @Override
    public String toString() {
        return taskId + "." + taskName;
    }
}