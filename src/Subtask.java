public class Subtask extends Task {
    String subtaskName;

    public Subtask() {
        super();
        subtaskName = "undefined";
    }

    public Subtask(String subtaskName, String taskName, String taskDescription, TaskCategory taskCategory, String taskDateTimeStop) {
        super(taskName, taskDescription, taskCategory, taskDateTimeStop);
        this.subtaskName = subtaskName;
    }

    public String getSubtaskName() {
        return subtaskName;
    }

    public void setSubtaskName(String subtaskName) {
        this.subtaskName = subtaskName;
    }

    public String toString() {
        return "Subtask name: " + subtaskName;
    }
}
