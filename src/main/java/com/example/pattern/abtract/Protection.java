package com.example.pattern.abtract;

public class Protection extends Task{
    String taskId;
    String taskName;
    public Protection(String taskId, String taskName){
        this.taskId=taskId;
        this.taskName=taskName;
    }
    @Override
    public String startTask() {
        return String.format("Protection Task %s with task id %s has been started", taskName, taskId);
    }
}
