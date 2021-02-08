package compositePattern.accounts;

import compositePattern.interfaces.Account;

import java.util.ArrayList;

public class BankAccounts implements Account {
    private final ArrayList<Account> accounts = new ArrayList<Account>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    @Override
    public void showAccountDetails() {
        System.out.println("Voici la liste des comptes :");
        for (Account account : accounts) {
            account.showAccountDetails();
        }
    }

    @Override
    public double getBalance() {
        double total = 0;
        for (Account account : accounts) {
            total += account.getBalance();
        }
        return total;
    }
}
