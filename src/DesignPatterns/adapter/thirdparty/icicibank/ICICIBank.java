package DesignPatterns.adapter.thirdparty.icicibank;

public class ICICIBank {

    public static void makePayment(String to, String from, int amount) {
        System.out.println("Making payment to " + to + " from " + from + " with amount " + amount);
    }

    public static void registerAccount(String accountNumber) {
        System.out.println("Registering account for " + accountNumber);
    }

    public static void getBalance(String accountNumber) {
        System.out.println("Getting balance for " + accountNumber);
    }
}
