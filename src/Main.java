import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date dateToEnd1 = new Date(System.currentTimeMillis() + 3600000);
        Date dateToEnd2 = new Date(System.currentTimeMillis() + 86400000);
        Date dateToEnd3 = new Date(System.currentTimeMillis() + 604800000);

        Object subtask1 = new Subtask("Sub Printing","Printing", "Printing documents", TaskCategory.IN_PROGRESS, dateToEnd1.toString());
        Object subtask2 = new Subtask("Sub Measuring","Measuring", "Measuring temperature", TaskCategory.NEW, dateToEnd2.toString());
        Object subtask3 = new Subtask("Sub Waiting", "Waiting", "Waiting for new tasks", TaskCategory.DONE, dateToEnd3.toString());

        Object task1 = new Task("Printing", "Printing documents", TaskCategory.IN_PROGRESS, dateToEnd1.toString());
        Object task2 = new Task("Measuring", "Measuring temperature", TaskCategory.NEW, dateToEnd2.toString());
        Object task3 = new Task("Waiting", "Waiting for new tasks", TaskCategory.DONE, dateToEnd3.toString());

        getDetailInfo(subtask1);
        getDetailInfo(task3);
    }

    public static void getDetailInfo(Object o) {
        String taskName;
        String taskDesc;
        String taskCategory;
        String taskDateTimeStart;
        String taskDateTimeStop;
        String subtaskTitle = "1";
        if (((Task) o).getTaskName().isEmpty()) {taskName = "B/D";} else {taskName = ((Task) o).getTaskName();}
        if (((Task) o).getTaskDescription().isEmpty()) {taskDesc = "B/D";} else {taskDesc = ((Task) o).getTaskDescription();}
        if (((Task) o).getTaskCategory().toString().isEmpty()) {taskCategory = "B/D";} else {taskCategory = ((Task) o).getTaskCategory().toString();}
        if (((Task) o).getTaskDateTimeStart().isEmpty()) {taskDateTimeStart = "B/D";} else {taskDateTimeStart = ((Task) o).getTaskDateTimeStart();}
        if (((Task) o).getTaskDateTimeStop().isEmpty()) {taskDateTimeStop = "B/D";} else {taskDateTimeStop = ((Task) o).getTaskDateTimeStop();}
        try {
            if (((Subtask) o).getSubtaskName().isEmpty()) {subtaskTitle = "B/D";} else {subtaskTitle = ((Subtask) o).getSubtaskName();}
        }
        catch(Exception e) {
            subtaskTitle = "B/D";
        }

        System.out.format("| taskName | wartość | %s\n", taskName);
        System.out.format("| taskDescription | wartość | %s\n", taskDesc);
        System.out.format("| taskCategory | wartość | %s\n", taskCategory);
        System.out.format("| taskDateTimeStart | wartość | %s\n", taskDateTimeStart);
        System.out.format("| taskDateTimeStop | wartość | %s\n", taskDateTimeStop);
        System.out.format("| subtaskTitle | wartość | %s\n\n", subtaskTitle);
    }
}
