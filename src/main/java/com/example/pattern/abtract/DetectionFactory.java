package com.example.pattern.abtract;

public class DetectionFactory implements TaskAbstractFactory{
    String taskId;
    String taskName;
    public DetectionFactory(String taskId, String taskName){
        this.taskId=taskId;
        this.taskName=taskName;
    }

    @Override
    public Task createTask() {
        return new Detection(taskId,taskName);
    }
}
