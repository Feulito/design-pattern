package compositePattern.accounts;

import compositePattern.interfaces.Account;

public class CurrentAccount implements Account {
    private final String bankName;
    private final double balance;

    public CurrentAccount(String bankName, double balance) {
        this.bankName = bankName;
        this.balance = balance;
    }

    @Override
    public void showAccountDetails() {
        System.out.println("Current Account : " + bankName + " - " + balance);
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
