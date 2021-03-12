import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.System;

public class Task {
    String taskName;
    String taskDescription;
    TaskCategory taskCategory;
    String taskDateTimeStart;
    String taskDateTimeStop;

    public Task(String taskName, String taskDescription, TaskCategory taskCategory, String taskDateTimeStop) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskCategory = taskCategory;
        this.taskDateTimeStop = taskDateTimeStop;

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        taskDateTimeStart = date.toString();
    }
}
