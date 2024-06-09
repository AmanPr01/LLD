package adapter;

import adapter.thirdparty.yesbank.YESBank;

public class YESBankAdapter implements BankAPI {

    @Override
    public void sendMoney(String to, String from, int amount) {
        YESBank.makePayment(to, from, amount);
    }

    @Override
    public void registerAccount(String accountNumber) {
        YESBank.registerAccount(accountNumber);
    }

    @Override
    public void getBalance(String accountNumber) {
        YESBank.getBalance(accountNumber);
    }
}
