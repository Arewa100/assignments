package bank;

import java.util.ArrayList;

public class Bank {
    private int numberOfAccount;
    ArrayList<Account> bankAccounts = new ArrayList<>();

    public Account createAccount(String accountNumber, String firstName, String lastName, String pin) {
        if(accountNumberExists(accountNumber)) {
            throw new IllegalArgumentException("Account number already exists...");
        } else {
            bankAccounts.add(new Account(accountNumber, firstName, lastName, pin));
            numberOfAccount = numberOfAccount + 1;
            return new Account(accountNumber, firstName, lastName, pin);
        }
    }

    public int getTotalAccount() {
        return numberOfAccount;
    }
    public void deposit(String accountNumber, int amount) {
        searchForAccount(accountNumber).deposit(accountNumber, amount);
    }
    public void withdraw(String accountNumber, int amount, String pin) {
        searchForAccount(accountNumber).withdraw(accountNumber, amount, pin);
    }
    public double checkBalance(String accountNumber, String pin) {
        return searchForAccount(accountNumber).getBalance(accountNumber, pin);
    }
    public void transferFrom(String senderAccountNumber, String receiverAccountNumber, int amount, String pin) {
        searchForAccount(senderAccountNumber).withdraw(senderAccountNumber, amount, pin);
        searchForAccount(receiverAccountNumber).deposit(receiverAccountNumber, amount);
    }
    public Account getAccountByNumber(String accountNumber) {
        Account account = null;
        for (Account searchedAccount : bankAccounts) {
            if (searchedAccount.getAccountNumber().equals(accountNumber)) {
                account = searchedAccount;
            }
        }
        return account;
    }

    private Account searchForAccount(String accountNumber) {
        Account account = null;
        for (Account searchedAccount : bankAccounts) {
            if (searchedAccount.getAccountNumber().equals(accountNumber)) {
                account = searchedAccount;
            }
        }
        return account;
    }
    private boolean accountNumberExists(String accountNumber) {
        for (Account searchedAccount : bankAccounts) {
            if (searchedAccount.getAccountNumber().equals(accountNumber)) {
                return true;
            }
        }
        return false;
    }
}
