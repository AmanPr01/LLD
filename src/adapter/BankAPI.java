package adapter;

public interface BankAPI {

    void sendMoney(String to, String from, int amount);

    void registerAccount(String accountNumber);

    void getBalance(String accountNumber);
}
