package com.example.demo;

import com.example.pattern.abtract.Task;
import com.example.pattern.abtract.TaskFactory;
import com.example.pattern.abtract.prototype.CloneObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class ParveenDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ParveenDemoApplication.class, args);
    }

    @GetMapping("/startTask")
    public String startTask(@RequestParam(value = "taskId", defaultValue = "") String taskId,
                            @RequestParam(value = "taskName", defaultValue = "") String taskName,
                            @RequestParam(value = "taskType", defaultValue = "") String taskType) {
        Task task = TaskFactory.getTask(taskId, taskName, taskType);
        return task.startTask();
    }

    @GetMapping("/protoTypeTest")
    public String startTask(@RequestParam(value = "objectId", defaultValue = "") String objectId) throws CloneNotSupportedException {
        CloneObject object1 = new CloneObject();
        object1.loadData();

        //Use the clone method to get the Employee object
        CloneObject object2 = (CloneObject) object1.clone();
        CloneObject object3 = (CloneObject) object1.clone();
        List<String> list = object2.getMemList();
        list.add("John");
        List<String> list1 = object3.getMemList();
        list1.remove("Pankaj");

        String returnString = "";
        switch (objectId) {
            case "1":
                returnString = object1.getListAsString();
                break;
            case "2":
                returnString = object2.getListAsString();
                break;
            case "3":
                returnString = object3.getListAsString();
                break;
            default:
                returnString = "Unsupport object id";
        }
        return returnString;
    }


}
          