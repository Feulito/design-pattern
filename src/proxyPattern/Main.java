package proxyPattern;

import proxyPattern.Proxy.ProxyAccount;

public class Main {
    public static void main(String[] args) {
        System.out.println("Balance du compte au nom de 'truc' : " + ProxyAccount.getAccountBalance("truc"));
    }
}
