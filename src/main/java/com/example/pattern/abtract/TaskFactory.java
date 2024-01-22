package com.example.pattern.abtract;

public class TaskFactory {
    public static Task getTask(String taskId, String taskName, String taskType) {
        TaskAbstractFactory factory = null;
        switch (taskType) {
            case "D":
                factory = new DetectionFactory(taskId, taskName);
                break;
            case "P":
                factory = new ProtectionFactory(taskId, taskName);
                break;
            default:
                System.out.println("Unsupported task type");
        }
        return factory.createTask();
    }
}
