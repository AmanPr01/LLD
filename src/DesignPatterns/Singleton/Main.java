package DesignPatterns.Singleton;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection databaseConnection1 = DatabaseConnection.getInstance();
        DatabaseConnection databaseConnection2 = DatabaseConnection.getInstance();
        System.out.println(databaseConnection1);
        System.out.println(databaseConnection2);

        System.out.println("DEBUG");
    }
}
