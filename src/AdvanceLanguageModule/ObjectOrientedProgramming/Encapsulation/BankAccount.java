package AdvanceLanguageModule.ObjectOrientedProgramming.Encapsulation;

public class BankAccount {

    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        }
        else {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        }
        else {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
    }

    public void deposit(double depositAmount) {
        if (depositAmount >= 0) {
            balance += depositAmount;
        }
        else {
            throw new IllegalArgumentException("Deposit amount cannot be negative");
        }
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount >= 0 && balance >= withdrawAmount) {
            balance -= withdrawAmount;
        }
        else {
            throw new IllegalArgumentException("Withdraw amount cannot be negative");
        }
    }
}
