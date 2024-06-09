package DesignPatterns;

public class DatabaseConnection {

    private static DatabaseConnection instance = null;

    String url;
    String username;
    String password;

    private DatabaseConnection() {

    }

    // Either we can create lock object or use synchronised keyword
    // Double Check Locking
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }

        return instance;
    }
}
