import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskManagerImpl implements TaskManager {

    List<Task> tasks = new ArrayList<Task>();

    public TaskManagerImpl() {
        this.tasks = Arrays.asList(TaskManager.tasks);
    }

    @Override
    public Task addTask(Task t) {
        tasks.add(t);
        return null;
    }

    @Override
    public void removeTask(Task t) {
        if (tasks.contains(t))
            tasks.remove(t);
    }

    @Override
    public Task[] getAllTasks() {
        return (Task[]) tasks.toArray();
    }

    @Override
    public Task getTaskByName(String taskName) {
        for (Task t : tasks) {
            if (t.getTaskName() == taskName)
                return t;
        }
        return null;
    }
}
