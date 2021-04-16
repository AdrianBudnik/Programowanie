import java.util.Arrays;
import java.util.Date;

public abstract class DBConnector {
    public abstract boolean connect(String dbName, String dbUser, String dbPassword);
    public abstract void close();

    public String executeQuery() {
        return Arrays.toString(TaskManager.tasks);
    }

    public boolean executeUpdate() {
        return (System.currentTimeMillis() % 2 == 0);
    }
}
