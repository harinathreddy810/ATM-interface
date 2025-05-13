package Miniproject;

import java.util.HashMap;

public class Bank {
    private HashMap<String, AccountHolder> holders;
    private HashMap<String, Account> accounts;

    public Bank() {
        holders = new HashMap<>();
        accounts = new HashMap<>();

        
        addUser("Hari", "1234");
        addUser("Sai", "5678");
    }

    private void addUser(String userId, String pin) {
        AccountHolder holder = new AccountHolder(userId, pin);
        Account account = new Account();
        holders.put(userId, holder);
        accounts.put(userId, account);
    }

    public AccountHolder getAccountHolder(String userId) {
        return holders.get(userId);
    }

    public Account getAccount(String userId) {
        return accounts.get(userId);
    }

    public boolean isValidUser(String userId, String pin) {
        AccountHolder holder = holders.get(userId);
        return holder != null && holder.validatePin(pin);
    }
}