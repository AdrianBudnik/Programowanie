import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        TaskManager tm = new TaskManagerImpl();

        MySQLConnector sqlConn = new MySQLConnector();
        sqlConn.connect("baza1", "admin", "haslo");
        System.out.println(sqlConn.executeUpdate());
        System.out.println(sqlConn.executeQuery());
    }
}
