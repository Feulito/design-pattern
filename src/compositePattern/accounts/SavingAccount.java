package compositePattern.accounts;

import compositePattern.interfaces.Account;

public class SavingAccount implements Account {
    private final String bankName;
    private final double balance;

    public SavingAccount(String bankName, double balance) {
        this.bankName = bankName;
        this.balance = balance;
    }

    @Override
    public void showAccountDetails() {
        System.out.println("Saving Account : " + bankName + " - " + balance);
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
