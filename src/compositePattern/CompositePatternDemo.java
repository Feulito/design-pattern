package compositePattern;

import compositePattern.accounts.BankAccounts;
import compositePattern.accounts.CurrentAccount;
import compositePattern.accounts.SavingAccount;

/**
 * L'intéret du patron de conception Composite est de traiter un groupe d'objet
 * comme si c'était un seul objet.
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
        BankAccounts bankAccounts = new BankAccounts();
        bankAccounts.addAccount(new CurrentAccount("Nom 1", 100));
        bankAccounts.addAccount(new SavingAccount("Nom 2", 200));

        bankAccounts.showAccountDetails();
    }
}
