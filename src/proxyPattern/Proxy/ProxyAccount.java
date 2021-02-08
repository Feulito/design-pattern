package proxyPattern.Proxy;

import compositePattern.accounts.CurrentAccount;

public class ProxyAccount {

    // Normalement ici on a un champ privé qui sera un accès vers une base de donnée

    public static double getAccountBalance(String bankName) {
        // Ici on va construire un faux objet pour simuler l'accès à une base de donnée
        CurrentAccount account = new CurrentAccount(bankName, 500);
        // Une fois qu'on a récupéré l'objet on retourne ce qui nous intéresse
        return account.getBalance();
    }

}
