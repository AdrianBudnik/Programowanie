import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.System;

public class Task {
    String taskName;
    String taskDescription;
    TaskCategory taskCategory;
    String taskDateTimeStart;
    String taskDateTimeStop;

    public Task() {
        this.taskName = "undefined";
        this.taskDescription = "undefined";
        this.taskCategory = TaskCategory.NEW;
        this.taskDateTimeStart = "undefined";
        this.taskDateTimeStop = "undefined";
    }

    public Task(String taskName, String taskDescription, TaskCategory taskCategory) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskCategory = taskCategory;
    }

    public Task(String taskName, String taskDescription, TaskCategory taskCategory, String taskDateTimeStop) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskCategory = taskCategory;
        this.taskDateTimeStop = taskDateTimeStop;

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        taskDateTimeStart = date.toString();
    }

    public String toString() {
        return "Name: " + taskName + ", Description: " + taskDescription + ", Category: " + taskCategory.name() +
                ", Time start: " + taskDateTimeStart + ", Time stop: " + taskDateTimeStop;
    }

    public String getTaskName() {
        return  taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public TaskCategory getTaskCategory() {
        return taskCategory;
    }

    public String getTaskDateTimeStart() {
        return  taskDateTimeStart;
    }

    public String getTaskDateTimeStop() {
        return taskDateTimeStop;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setTaskCategory(TaskCategory taskCategory) {
        this.taskCategory = taskCategory;
    }

    public void setTaskDateTimeStart(String taskDateTimeStart) {
        this.taskDateTimeStart = taskDateTimeStart;
    }

    public void setTaskDateTimeStop(String taskDateTimeStop) {
        this.taskDateTimeStop = taskDateTimeStop;
    }
}
