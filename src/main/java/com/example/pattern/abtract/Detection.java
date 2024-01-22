package com.example.pattern.abtract;

public class Detection extends Task{
    String taskId;
    String taskName;
    public Detection(String taskId, String taskName){
        this.taskId=taskId;
        this.taskName=taskName;
    }
    @Override
    public String startTask() {
        return String.format("Detection Task %s with task id %s has been started", taskName, taskId);
    }
}
