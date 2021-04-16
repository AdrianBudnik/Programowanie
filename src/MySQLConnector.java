public class MySQLConnector extends DBConnector {

    @Override
    public boolean connect(String dbName, String dbUser, String dbPassword) {
        return false;
    }

    @Override
    public void close() {

    }
}
