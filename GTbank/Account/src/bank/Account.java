package bank;

public class Account {

    private double balance;
    private String name;
    private String pin;
    private int accountNumber;

    public Account(int accountNumber, String firstName, String lastName, String pin) {
        name = firstName + " " + lastName;
        this.pin = pin;
        this.accountNumber = accountNumber;
    }

    public void deposit(int accountNumber, int amount, String pin) {
        if(accountAndPinIsValid(accountNumber, pin) && amount > 0) balance += amount;
    }

    public double getBalance(int accountNumber, String pin) {
        if(accountAndPinIsValid(accountNumber, pin)) {
            return balance;
        } else {
            return 0.0;
        }
    }

    public void withdraw(int accountNumber, int amount, String pin) {
        boolean accountBalanceIsSufficient = (amount > 0 && amount < balance);
        if(accountAndPinIsValid(accountNumber, pin) && accountBalanceIsSufficient) balance -= amount;
    }
    private boolean accountAndPinIsValid(int accountNumber, String pin) {
        boolean accountIsValidAndPinIsCorrect = (this.pin.equals(pin) && this.accountNumber == accountNumber);
        return accountIsValidAndPinIsCorrect ? true : false;
    }

    public void updatePin(String correctPin, String newPin) {
        if(pin.equals(newPin)) {
            throw new IllegalArgumentException("Incorrect pin...");
        }else {
            pin = newPin;
        }
    }
}