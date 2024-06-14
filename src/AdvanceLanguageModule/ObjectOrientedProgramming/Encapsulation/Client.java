package AdvanceLanguageModule.ObjectOrientedProgramming.Encapsulation;

public class Client {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(123456789, 5000);

        // depositing money
        bankAccount.deposit(1000);
        System.out.println("Account balance: " + bankAccount.getBalance());

        // withdrawing money
        bankAccount.withdraw(5000);
        System.out.println("Account balance: " + bankAccount.getBalance());
    }
}
