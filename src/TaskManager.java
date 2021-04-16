import java.util.ArrayList;
import java.util.List;

public interface TaskManager {
    public Task addTask(Task t);
    public void removeTask(Task t);
    public Task[] getAllTasks();
    public Task getTaskByName(String taskName);

    public static final Task [] tasks = {
            new Task("Odkurzanie", "Odkurzyc mieszkanie", TaskCategory.DONE),
            new Task("Zmywanie", "Zmyc naczynia", TaskCategory.IN_PROGRESS),
            new Task("Silownia", "Wyjsc na silownie", TaskCategory.DONE),
            new Task("Bieganie", "Pojsc pobiegac", TaskCategory.NEW),
            new Task("Film", "Obejrzec film", TaskCategory.NEW),
            new Task("Nauka", "Przygotowac sie do zajec", TaskCategory.DONE),
            new Task("Spotkanie", "Wyjsc ze znajomymi", TaskCategory.NEW),
            new Task("Spanie", "Wyspac sie", TaskCategory.NEW),
            new Task("Naprawa", "Naprawic komputer", TaskCategory.DONE),
            new Task("Sprawozdanie", "Napisac sprawozdanie", TaskCategory.IN_PROGRESS)
    };
}
