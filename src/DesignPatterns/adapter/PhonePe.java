package DesignPatterns.adapter;

public class PhonePe {

    private static BankAPI bankAPI = new ICICIAdapter();

    public static void main(String[] args) {
        bankAPI.registerAccount("1234");
        bankAPI.sendMoney("1234", "4567", 1000);
        bankAPI.getBalance("1234");
    }
}
