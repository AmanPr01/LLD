package adapter;

import adapter.thirdparty.icicibank.ICICIBank;

public class ICICIAdapter implements BankAPI {

    @Override
    public void sendMoney(String to, String from, int amount) {
        ICICIBank.makePayment(to, from, amount);
    }

    @Override
    public void registerAccount(String accountNumber) {
        ICICIBank.registerAccount(accountNumber);
    }

    @Override
    public void getBalance(String accountNumber) {
        ICICIBank.getBalance(accountNumber);
    }
}
