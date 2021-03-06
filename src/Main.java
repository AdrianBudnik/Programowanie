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

        Task task1 = new Task("Printing", "Printing documents", TaskCategory.IN_PROGRESS, dateToEnd1.toString());
        Task task2 = new Task("Measuring", "Measuring temperature", TaskCategory.NEW, dateToEnd2.toString());
        Task task3 = new Task("Waiting", "Waiting for new tasks", TaskCategory.DONE, dateToEnd3.toString());

        Date dateToEnd4 = new Date(System.currentTimeMillis() + TimeUnit.DAYS.toMillis(90));
        Task task4 = new Task("New", "Some task to do", TaskCategory.NEW, dateToEnd4.toString());

        List<Task> taskList = new ArrayList<Task>();
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);
        taskList.add(task4);

        for (Task task : taskList) {
            System.out.println(task.toString());
        }
    }
}
