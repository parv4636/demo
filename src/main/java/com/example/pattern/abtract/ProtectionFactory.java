package com.example.pattern.abtract;

public class ProtectionFactory implements TaskAbstractFactory{
    String taskId;
    String taskName;
    public ProtectionFactory(String taskId, String taskName){
        this.taskId=taskId;
        this.taskName=taskName;
    }

    @Override
    public Task createTask() {
        return new Protection(taskId,taskName);
    }
}
